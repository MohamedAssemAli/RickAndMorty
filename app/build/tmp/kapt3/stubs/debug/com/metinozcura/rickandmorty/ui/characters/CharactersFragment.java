package com.metinozcura.rickandmorty.ui.characters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/characters/CharactersFragment;", "Lcom/metinozcura/rickandmorty/base/BaseFragment;", "Lcom/metinozcura/rickandmorty/databinding/FragmentCharactersBinding;", "Lcom/metinozcura/rickandmorty/ui/characters/CharactersViewModel;", "Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter$CharacterClickListener;", "()V", "characterAdapter", "Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter;", "getCharacterAdapter", "()Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter;", "setCharacterAdapter", "(Lcom/metinozcura/rickandmorty/ui/adapter/CharacterAdapter;)V", "charactersViewModel", "getCharactersViewModel", "()Lcom/metinozcura/rickandmorty/ui/characters/CharactersViewModel;", "charactersViewModel$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "bindVM", "", "binding", "vm", "getVM", "onCharacterClicked", "Lcom/metinozcura/rickandmorty/databinding/ItemCharacterBinding;", "character", "Lcom/metinozcura/rickandmorty/data/model/Character;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CharactersFragment extends com.metinozcura.rickandmorty.base.BaseFragment<com.metinozcura.rickandmorty.databinding.FragmentCharactersBinding, com.metinozcura.rickandmorty.ui.characters.CharactersViewModel> implements com.metinozcura.rickandmorty.ui.adapter.CharacterAdapter.CharacterClickListener {
    private final kotlin.Lazy charactersViewModel$delegate = null;
    @javax.inject.Inject()
    public com.metinozcura.rickandmorty.ui.adapter.CharacterAdapter characterAdapter;
    
    public CharactersFragment() {
        super();
    }
    
    private final com.metinozcura.rickandmorty.ui.characters.CharactersViewModel getCharactersViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metinozcura.rickandmorty.ui.adapter.CharacterAdapter getCharacterAdapter() {
        return null;
    }
    
    public final void setCharacterAdapter(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.ui.adapter.CharacterAdapter p0) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.metinozcura.rickandmorty.ui.characters.CharactersViewModel getVM() {
        return null;
    }
    
    @java.lang.Override()
    public void bindVM(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.databinding.FragmentCharactersBinding binding, @org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.ui.characters.CharactersViewModel vm) {
    }
    
    @java.lang.Override()
    public void onCharacterClicked(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.databinding.ItemCharacterBinding binding, @org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.data.model.Character character) {
    }
}