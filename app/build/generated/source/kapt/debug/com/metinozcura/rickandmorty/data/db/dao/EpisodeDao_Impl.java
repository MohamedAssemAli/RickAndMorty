package com.metinozcura.rickandmorty.data.db.dao;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.metinozcura.rickandmorty.data.db.converter.StringListConverter;
import com.metinozcura.rickandmorty.data.model.Episode;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EpisodeDao_Impl implements EpisodeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Episode> __insertionAdapterOfEpisode;

  private final StringListConverter __stringListConverter = new StringListConverter();

  private final SharedSQLiteStatement __preparedStmtOfClearAll;

  public EpisodeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEpisode = new EntityInsertionAdapter<Episode>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `episodes` (`id`,`name`,`airDate`,`code`,`characters`,`page`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Episode value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAirDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAirDate());
        }
        if (value.getCode() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCode());
        }
        final String _tmp;
        _tmp = __stringListConverter.toString(value.getCharacters());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getPage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getPage());
        }
      }
    };
    this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM episodes";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final List<Episode> episodes,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfEpisode.insert(episodes);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clearAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, Episode> pagingSource() {
    final String _sql = "SELECT * FROM episodes";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, Episode>() {
      @Override
      public LimitOffsetDataSource<Episode> create() {
        return new LimitOffsetDataSource<Episode>(__db, _statement, false , "episodes") {
          @Override
          protected List<Episode> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
            final int _cursorIndexOfAirDate = CursorUtil.getColumnIndexOrThrow(cursor, "airDate");
            final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(cursor, "code");
            final int _cursorIndexOfCharacters = CursorUtil.getColumnIndexOrThrow(cursor, "characters");
            final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(cursor, "page");
            final List<Episode> _res = new ArrayList<Episode>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Episode _item;
              final int _tmpId;
              _tmpId = cursor.getInt(_cursorIndexOfId);
              final String _tmpName;
              if (cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = cursor.getString(_cursorIndexOfName);
              }
              final String _tmpAirDate;
              if (cursor.isNull(_cursorIndexOfAirDate)) {
                _tmpAirDate = null;
              } else {
                _tmpAirDate = cursor.getString(_cursorIndexOfAirDate);
              }
              final String _tmpCode;
              if (cursor.isNull(_cursorIndexOfCode)) {
                _tmpCode = null;
              } else {
                _tmpCode = cursor.getString(_cursorIndexOfCode);
              }
              final List<String> _tmpCharacters;
              final String _tmp;
              if (cursor.isNull(_cursorIndexOfCharacters)) {
                _tmp = null;
              } else {
                _tmp = cursor.getString(_cursorIndexOfCharacters);
              }
              _tmpCharacters = __stringListConverter.fromString(_tmp);
              final Integer _tmpPage;
              if (cursor.isNull(_cursorIndexOfPage)) {
                _tmpPage = null;
              } else {
                _tmpPage = cursor.getInt(_cursorIndexOfPage);
              }
              _item = new Episode(_tmpId,_tmpName,_tmpAirDate,_tmpCode,_tmpCharacters,_tmpPage);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    }.asPagingSourceFactory().invoke();
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
