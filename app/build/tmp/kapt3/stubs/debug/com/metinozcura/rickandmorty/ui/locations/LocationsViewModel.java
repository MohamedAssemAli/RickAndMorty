package com.metinozcura.rickandmorty.ui.locations;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/locations/LocationsViewModel;", "Lcom/metinozcura/rickandmorty/base/BaseViewModel;", "locationRepository", "Lcom/metinozcura/rickandmorty/data/repository/location/LocationRepository;", "(Lcom/metinozcura/rickandmorty/data/repository/location/LocationRepository;)V", "_locationsFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/metinozcura/rickandmorty/ui/locations/model/LocationModel;", "locationsFlow", "getLocationsFlow", "()Lkotlinx/coroutines/flow/Flow;", "getAllLocations", "", "app_debug"})
public final class LocationsViewModel extends com.metinozcura.rickandmorty.base.BaseViewModel {
    private final com.metinozcura.rickandmorty.data.repository.location.LocationRepository locationRepository = null;
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.metinozcura.rickandmorty.ui.locations.model.LocationModel>> _locationsFlow;
    
    @javax.inject.Inject()
    public LocationsViewModel(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.data.repository.location.LocationRepository locationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.metinozcura.rickandmorty.ui.locations.model.LocationModel>> getLocationsFlow() {
        return null;
    }
    
    private final void getAllLocations() {
    }
}