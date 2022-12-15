package com.metinozcura.rickandmorty.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.metinozcura.rickandmorty.data.db.dao.EpisodeDao;
import com.metinozcura.rickandmorty.data.db.dao.EpisodeDao_Impl;
import com.metinozcura.rickandmorty.data.db.dao.PageKeyDao;
import com.metinozcura.rickandmorty.data.db.dao.PageKeyDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDB_Impl extends AppDB {
  private volatile EpisodeDao _episodeDao;

  private volatile PageKeyDao _pageKeyDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `episodes` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `airDate` TEXT NOT NULL, `code` TEXT NOT NULL, `characters` TEXT NOT NULL, `page` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `pageKey` (`id` INTEGER NOT NULL, `nextPageUrl` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '00ca7d9c5b98202812a68826b49a4674')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `episodes`");
        _db.execSQL("DROP TABLE IF EXISTS `pageKey`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsEpisodes = new HashMap<String, TableInfo.Column>(6);
        _columnsEpisodes.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("airDate", new TableInfo.Column("airDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("code", new TableInfo.Column("code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("characters", new TableInfo.Column("characters", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("page", new TableInfo.Column("page", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEpisodes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEpisodes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEpisodes = new TableInfo("episodes", _columnsEpisodes, _foreignKeysEpisodes, _indicesEpisodes);
        final TableInfo _existingEpisodes = TableInfo.read(_db, "episodes");
        if (! _infoEpisodes.equals(_existingEpisodes)) {
          return new RoomOpenHelper.ValidationResult(false, "episodes(com.metinozcura.rickandmorty.data.model.Episode).\n"
                  + " Expected:\n" + _infoEpisodes + "\n"
                  + " Found:\n" + _existingEpisodes);
        }
        final HashMap<String, TableInfo.Column> _columnsPageKey = new HashMap<String, TableInfo.Column>(2);
        _columnsPageKey.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPageKey.put("nextPageUrl", new TableInfo.Column("nextPageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPageKey = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPageKey = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPageKey = new TableInfo("pageKey", _columnsPageKey, _foreignKeysPageKey, _indicesPageKey);
        final TableInfo _existingPageKey = TableInfo.read(_db, "pageKey");
        if (! _infoPageKey.equals(_existingPageKey)) {
          return new RoomOpenHelper.ValidationResult(false, "pageKey(com.metinozcura.rickandmorty.data.model.PageKey).\n"
                  + " Expected:\n" + _infoPageKey + "\n"
                  + " Found:\n" + _existingPageKey);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "00ca7d9c5b98202812a68826b49a4674", "24a7a0598c3743ecdd3294745b316a2f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "episodes","pageKey");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `episodes`");
      _db.execSQL("DELETE FROM `pageKey`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(EpisodeDao.class, EpisodeDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PageKeyDao.class, PageKeyDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public EpisodeDao episodeDao() {
    if (_episodeDao != null) {
      return _episodeDao;
    } else {
      synchronized(this) {
        if(_episodeDao == null) {
          _episodeDao = new EpisodeDao_Impl(this);
        }
        return _episodeDao;
      }
    }
  }

  @Override
  public PageKeyDao pageKeyDao() {
    if (_pageKeyDao != null) {
      return _pageKeyDao;
    } else {
      synchronized(this) {
        if(_pageKeyDao == null) {
          _pageKeyDao = new PageKeyDao_Impl(this);
        }
        return _pageKeyDao;
      }
    }
  }
}
