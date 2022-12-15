package com.metinozcura.rickandmorty.data.db.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.metinozcura.rickandmorty.data.model.PageKey;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PageKeyDao_Impl implements PageKeyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PageKey> __insertionAdapterOfPageKey;

  private final SharedSQLiteStatement __preparedStmtOfClearAll;

  public PageKeyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPageKey = new EntityInsertionAdapter<PageKey>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `pageKey` (`id`,`nextPageUrl`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PageKey value) {
        stmt.bindLong(1, value.getId());
        if (value.getNextPageUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNextPageUrl());
        }
      }
    };
    this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM pageKey";
        return _query;
      }
    };
  }

  @Override
  public Object insertOrReplace(final PageKey pageKey,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPageKey.insert(pageKey);
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
  public PageKey getNextPageKey(final int id) {
    final String _sql = "SELECT * FROM pageKey WHERE id LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNextPageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "nextPageUrl");
      final PageKey _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNextPageUrl;
        if (_cursor.isNull(_cursorIndexOfNextPageUrl)) {
          _tmpNextPageUrl = null;
        } else {
          _tmpNextPageUrl = _cursor.getString(_cursorIndexOfNextPageUrl);
        }
        _result = new PageKey(_tmpId,_tmpNextPageUrl);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
