package com.metinozcura.rickandmorty.ui.locations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/locations/LocationsFragment;", "Lcom/metinozcura/rickandmorty/base/BaseFragment;", "Lcom/metinozcura/rickandmorty/databinding/FragmentLocationsBinding;", "Lcom/metinozcura/rickandmorty/ui/locations/LocationsViewModel;", "()V", "layoutId", "", "getLayoutId", "()I", "locationAdapter", "Lcom/metinozcura/rickandmorty/ui/adapter/LocationAdapter;", "getLocationAdapter", "()Lcom/metinozcura/rickandmorty/ui/adapter/LocationAdapter;", "setLocationAdapter", "(Lcom/metinozcura/rickandmorty/ui/adapter/LocationAdapter;)V", "locationsViewModel", "getLocationsViewModel", "()Lcom/metinozcura/rickandmorty/ui/locations/LocationsViewModel;", "locationsViewModel$delegate", "Lkotlin/Lazy;", "bindVM", "", "binding", "vm", "getVM", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LocationsFragment extends com.metinozcura.rickandmorty.base.BaseFragment<com.metinozcura.rickandmorty.databinding.FragmentLocationsBinding, com.metinozcura.rickandmorty.ui.locations.LocationsViewModel> {
    private final kotlin.Lazy locationsViewModel$delegate = null;
    @javax.inject.Inject()
    public com.metinozcura.rickandmorty.ui.adapter.LocationAdapter locationAdapter;
    
    public LocationsFragment() {
        super();
    }
    
    private final com.metinozcura.rickandmorty.ui.locations.LocationsViewModel getLocationsViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metinozcura.rickandmorty.ui.adapter.LocationAdapter getLocationAdapter() {
        return null;
    }
    
    public final void setLocationAdapter(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.ui.adapter.LocationAdapter p0) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.metinozcura.rickandmorty.ui.locations.LocationsViewModel getVM() {
        return null;
    }
    
    @java.lang.Override()
    public void bindVM(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.databinding.FragmentLocationsBinding binding, @org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.ui.locations.LocationsViewModel vm) {
    }
}