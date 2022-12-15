package com.metinozcura.rickandmorty.ui.episodes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0019"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/episodes/EpisodesFragment;", "Lcom/metinozcura/rickandmorty/base/BaseFragment;", "Lcom/metinozcura/rickandmorty/databinding/FragmentEpisodesBinding;", "Lcom/metinozcura/rickandmorty/ui/episodes/EpisodesViewModel;", "()V", "episodeAdapter", "Lcom/metinozcura/rickandmorty/ui/adapter/EpisodeAdapter;", "getEpisodeAdapter", "()Lcom/metinozcura/rickandmorty/ui/adapter/EpisodeAdapter;", "setEpisodeAdapter", "(Lcom/metinozcura/rickandmorty/ui/adapter/EpisodeAdapter;)V", "episodesViewModel", "getEpisodesViewModel", "()Lcom/metinozcura/rickandmorty/ui/episodes/EpisodesViewModel;", "episodesViewModel$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "bindVM", "", "binding", "vm", "getVM", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class EpisodesFragment extends com.metinozcura.rickandmorty.base.BaseFragment<com.metinozcura.rickandmorty.databinding.FragmentEpisodesBinding, com.metinozcura.rickandmorty.ui.episodes.EpisodesViewModel> {
    private final kotlin.Lazy episodesViewModel$delegate = null;
    @javax.inject.Inject()
    public com.metinozcura.rickandmorty.ui.adapter.EpisodeAdapter episodeAdapter;
    
    public EpisodesFragment() {
        super();
    }
    
    private final com.metinozcura.rickandmorty.ui.episodes.EpisodesViewModel getEpisodesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metinozcura.rickandmorty.ui.adapter.EpisodeAdapter getEpisodeAdapter() {
        return null;
    }
    
    public final void setEpisodeAdapter(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.ui.adapter.EpisodeAdapter p0) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.metinozcura.rickandmorty.ui.episodes.EpisodesViewModel getVM() {
        return null;
    }
    
    @java.lang.Override()
    public void bindVM(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.databinding.FragmentEpisodesBinding binding, @org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.ui.episodes.EpisodesViewModel vm) {
    }
}