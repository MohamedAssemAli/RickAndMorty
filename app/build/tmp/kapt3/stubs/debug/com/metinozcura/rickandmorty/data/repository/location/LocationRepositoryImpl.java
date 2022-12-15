package com.metinozcura.rickandmorty.data.repository.location;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/metinozcura/rickandmorty/data/repository/location/LocationRepositoryImpl;", "Lcom/metinozcura/rickandmorty/data/repository/location/LocationRepository;", "service", "Lcom/metinozcura/rickandmorty/data/service/LocationApi;", "(Lcom/metinozcura/rickandmorty/data/service/LocationApi;)V", "getAllLocations", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/metinozcura/rickandmorty/data/model/Location;", "app_debug"})
public final class LocationRepositoryImpl implements com.metinozcura.rickandmorty.data.repository.location.LocationRepository {
    private final com.metinozcura.rickandmorty.data.service.LocationApi service = null;
    
    @javax.inject.Inject()
    public LocationRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.data.service.LocationApi service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.metinozcura.rickandmorty.data.model.Location>> getAllLocations() {
        return null;
    }
}