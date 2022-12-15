package com.metinozcura.rickandmorty.data.paging.remotemediator;

import java.lang.System;

@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ-\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/metinozcura/rickandmorty/data/paging/remotemediator/EpisodeRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lcom/metinozcura/rickandmorty/data/model/Episode;", "service", "Lcom/metinozcura/rickandmorty/data/service/EpisodeApi;", "db", "Lcom/metinozcura/rickandmorty/data/db/AppDB;", "(Lcom/metinozcura/rickandmorty/data/service/EpisodeApi;Lcom/metinozcura/rickandmorty/data/db/AppDB;)V", "getDb", "()Lcom/metinozcura/rickandmorty/data/db/AppDB;", "episodeDao", "Lcom/metinozcura/rickandmorty/data/db/dao/EpisodeDao;", "keyDao", "Lcom/metinozcura/rickandmorty/data/db/dao/PageKeyDao;", "getService", "()Lcom/metinozcura/rickandmorty/data/service/EpisodeApi;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class EpisodeRemoteMediator extends androidx.paging.RemoteMediator<java.lang.Integer, com.metinozcura.rickandmorty.data.model.Episode> {
    @org.jetbrains.annotations.NotNull()
    private final com.metinozcura.rickandmorty.data.service.EpisodeApi service = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metinozcura.rickandmorty.data.db.AppDB db = null;
    private final com.metinozcura.rickandmorty.data.db.dao.EpisodeDao episodeDao = null;
    private final com.metinozcura.rickandmorty.data.db.dao.PageKeyDao keyDao = null;
    
    public EpisodeRemoteMediator(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.data.service.EpisodeApi service, @org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.data.db.AppDB db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metinozcura.rickandmorty.data.service.EpisodeApi getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metinozcura.rickandmorty.data.db.AppDB getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.metinozcura.rickandmorty.data.model.Episode> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation) {
        return null;
    }
}