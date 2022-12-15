package com.metinozcura.rickandmorty.data.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.metinozcura.rickandmorty.data.db.converter.StringListConverter.class})
@androidx.room.Database(entities = {com.metinozcura.rickandmorty.data.model.Episode.class, com.metinozcura.rickandmorty.data.model.PageKey.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/metinozcura/rickandmorty/data/db/AppDB;", "Landroidx/room/RoomDatabase;", "()V", "episodeDao", "Lcom/metinozcura/rickandmorty/data/db/dao/EpisodeDao;", "pageKeyDao", "Lcom/metinozcura/rickandmorty/data/db/dao/PageKeyDao;", "Companion", "app_debug"})
public abstract class AppDB extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.metinozcura.rickandmorty.data.db.AppDB.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.metinozcura.rickandmorty.data.db.AppDB instance;
    
    public AppDB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.metinozcura.rickandmorty.data.db.dao.EpisodeDao episodeDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.metinozcura.rickandmorty.data.db.dao.PageKeyDao pageKeyDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/metinozcura/rickandmorty/data/db/AppDB$Companion;", "", "()V", "instance", "Lcom/metinozcura/rickandmorty/data/db/AppDB;", "buildDatabase", "appContext", "Landroid/content/Context;", "getDatabase", "context", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.metinozcura.rickandmorty.data.db.AppDB getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.metinozcura.rickandmorty.data.db.AppDB buildDatabase(android.content.Context appContext) {
            return null;
        }
    }
}