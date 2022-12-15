package com.metinozcura.rickandmorty.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u000f\u0010\u0011\u0012B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u0013"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/LocationAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/metinozcura/rickandmorty/ui/locations/model/LocationModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "LocationComparator", "LocationDataViewHolder", "LocationSeparatorViewHolder", "app_debug"})
public final class LocationAdapter extends androidx.paging.PagingDataAdapter<com.metinozcura.rickandmorty.ui.locations.model.LocationModel, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public static final com.metinozcura.rickandmorty.ui.adapter.LocationAdapter.Companion Companion = null;
    private static final int TYPE_LOCATION = 0;
    private static final int TYPE_SEPARATOR = 1;
    
    @javax.inject.Inject()
    public LocationAdapter() {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/LocationAdapter$LocationDataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/metinozcura/rickandmorty/databinding/ItemLocationBinding;", "(Lcom/metinozcura/rickandmorty/ui/adapter/LocationAdapter;Lcom/metinozcura/rickandmorty/databinding/ItemLocationBinding;)V", "bind", "", "item", "Lcom/metinozcura/rickandmorty/ui/locations/model/LocationModel$LocationData;", "app_debug"})
    public final class LocationDataViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.metinozcura.rickandmorty.databinding.ItemLocationBinding binding = null;
        
        public LocationDataViewHolder(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.databinding.ItemLocationBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.ui.locations.model.LocationModel.LocationData item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/LocationAdapter$LocationSeparatorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/metinozcura/rickandmorty/databinding/ItemSeparatorLocationBinding;", "(Lcom/metinozcura/rickandmorty/ui/adapter/LocationAdapter;Lcom/metinozcura/rickandmorty/databinding/ItemSeparatorLocationBinding;)V", "app_debug"})
    public final class LocationSeparatorViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.metinozcura.rickandmorty.databinding.ItemSeparatorLocationBinding binding = null;
        
        public LocationSeparatorViewHolder(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.databinding.ItemSeparatorLocationBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/LocationAdapter$LocationComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/metinozcura/rickandmorty/ui/locations/model/LocationModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class LocationComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.metinozcura.rickandmorty.ui.locations.model.LocationModel> {
        @org.jetbrains.annotations.NotNull()
        public static final com.metinozcura.rickandmorty.ui.adapter.LocationAdapter.LocationComparator INSTANCE = null;
        
        private LocationComparator() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.ui.locations.model.LocationModel oldItem, @org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.ui.locations.model.LocationModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.ui.locations.model.LocationModel oldItem, @org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.ui.locations.model.LocationModel newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/LocationAdapter$Companion;", "", "()V", "TYPE_LOCATION", "", "TYPE_SEPARATOR", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}