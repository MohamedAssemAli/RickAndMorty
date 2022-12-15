package com.metinozcura.rickandmorty.data.repository.episode;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/metinozcura/rickandmorty/data/repository/episode/EpisodeRepositoryImpl;", "Lcom/metinozcura/rickandmorty/data/repository/episode/EpisodeRepository;", "service", "Lcom/metinozcura/rickandmorty/data/service/EpisodeApi;", "db", "Lcom/metinozcura/rickandmorty/data/db/AppDB;", "(Lcom/metinozcura/rickandmorty/data/service/EpisodeApi;Lcom/metinozcura/rickandmorty/data/db/AppDB;)V", "getAllEpisodes", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/metinozcura/rickandmorty/data/model/Episode;", "app_debug"})
public final class EpisodeRepositoryImpl implements com.metinozcura.rickandmorty.data.repository.episode.EpisodeRepository {
    private final com.metinozcura.rickandmorty.data.service.EpisodeApi service = null;
    private final com.metinozcura.rickandmorty.data.db.AppDB db = null;
    
    @javax.inject.Inject()
    public EpisodeRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.data.service.EpisodeApi service, @org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.data.db.AppDB db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.metinozcura.rickandmorty.data.model.Episode>> getAllEpisodes() {
        return null;
    }
}