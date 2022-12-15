package com.metinozcura.rickandmorty.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0014\u0015\u0016B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/metinozcura/rickandmorty/data/model/Character;", "Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter$CharacterViewHolder;", "()V", "characterClickListener", "Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter$CharacterClickListener;", "getCharacterClickListener", "()Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter$CharacterClickListener;", "setCharacterClickListener", "(Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter$CharacterClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CharacterClickListener", "CharacterComparator", "CharacterViewHolder", "app_debug"})
public final class CharacterAdapter extends androidx.paging.PagingDataAdapter<com.metinozcura.rickandmorty.data.model.Character, com.metinozcura.rickandmorty.ui.adapter.CharacterAdapter.CharacterViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.metinozcura.rickandmorty.ui.adapter.CharacterAdapter.CharacterClickListener characterClickListener;
    
    @javax.inject.Inject()
    public CharacterAdapter() {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.metinozcura.rickandmorty.ui.adapter.CharacterAdapter.CharacterClickListener getCharacterClickListener() {
        return null;
    }
    
    public final void setCharacterClickListener(@org.jetbrains.annotations.Nullable()
    com.metinozcura.rickandmorty.ui.adapter.CharacterAdapter.CharacterClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.metinozcura.rickandmorty.ui.adapter.CharacterAdapter.CharacterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.ui.adapter.CharacterAdapter.CharacterViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter$CharacterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/metinozcura/rickandmorty/databinding/ItemCharacterBinding;", "(Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter;Lcom/metinozcura/rickandmorty/databinding/ItemCharacterBinding;)V", "bind", "", "item", "Lcom/metinozcura/rickandmorty/data/model/Character;", "app_debug"})
    public final class CharacterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.metinozcura.rickandmorty.databinding.ItemCharacterBinding binding = null;
        
        public CharacterViewHolder(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.databinding.ItemCharacterBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Character item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter$CharacterComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/metinozcura/rickandmorty/data/model/Character;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class CharacterComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.metinozcura.rickandmorty.data.model.Character> {
        @org.jetbrains.annotations.NotNull()
        public static final com.metinozcura.rickandmorty.ui.adapter.CharacterAdapter.CharacterComparator INSTANCE = null;
        
        private CharacterComparator() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Character oldItem, @org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Character newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Character oldItem, @org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Character newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter$CharacterClickListener;", "", "onCharacterClicked", "", "binding", "Lcom/metinozcura/rickandmorty/databinding/ItemCharacterBinding;", "character", "Lcom/metinozcura/rickandmorty/data/model/Character;", "app_debug"})
    public static abstract interface CharacterClickListener {
        
        public abstract void onCharacterClicked(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.databinding.ItemCharacterBinding binding, @org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Character character);
    }
}