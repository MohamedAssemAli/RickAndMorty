package com.metinozcura.rickandmorty.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/EpisodeAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/metinozcura/rickandmorty/data/model/Episode;", "Lcom/metinozcura/rickandmorty/ui/adapter/EpisodeAdapter$EpisodeViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "EpisodeComparator", "EpisodeViewHolder", "app_debug"})
public final class EpisodeAdapter extends androidx.paging.PagingDataAdapter<com.metinozcura.rickandmorty.data.model.Episode, com.metinozcura.rickandmorty.ui.adapter.EpisodeAdapter.EpisodeViewHolder> {
    
    @javax.inject.Inject()
    public EpisodeAdapter() {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.metinozcura.rickandmorty.ui.adapter.EpisodeAdapter.EpisodeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.ui.adapter.EpisodeAdapter.EpisodeViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/EpisodeAdapter$EpisodeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/metinozcura/rickandmorty/databinding/ItemEpisodeBinding;", "(Lcom/metinozcura/rickandmorty/ui/adapter/EpisodeAdapter;Lcom/metinozcura/rickandmorty/databinding/ItemEpisodeBinding;)V", "bind", "", "item", "Lcom/metinozcura/rickandmorty/data/model/Episode;", "app_debug"})
    public final class EpisodeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.metinozcura.rickandmorty.databinding.ItemEpisodeBinding binding = null;
        
        public EpisodeViewHolder(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.databinding.ItemEpisodeBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Episode item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/EpisodeAdapter$EpisodeComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/metinozcura/rickandmorty/data/model/Episode;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class EpisodeComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.metinozcura.rickandmorty.data.model.Episode> {
        @org.jetbrains.annotations.NotNull()
        public static final com.metinozcura.rickandmorty.ui.adapter.EpisodeAdapter.EpisodeComparator INSTANCE = null;
        
        private EpisodeComparator() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Episode oldItem, @org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Episode newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Episode oldItem, @org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Episode newItem) {
            return false;
        }
    }
}