package com.metinozcura.rickandmorty.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/main/MainActivity;", "Lcom/metinozcura/rickandmorty/base/BaseActivity;", "Lcom/metinozcura/rickandmorty/databinding/ActivityMainBinding;", "Lcom/metinozcura/rickandmorty/ui/main/MainViewModel;", "()V", "currentNavController", "Landroidx/lifecycle/LiveData;", "Landroidx/navigation/NavController;", "layoutId", "", "getLayoutId", "()I", "mainViewModel", "getMainViewModel", "()Lcom/metinozcura/rickandmorty/ui/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "bindVM", "", "binding", "vm", "getVM", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRestoreInstanceState", "onSupportNavigateUp", "", "setupBottomNavigationBar", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.metinozcura.rickandmorty.base.BaseActivity<com.metinozcura.rickandmorty.databinding.ActivityMainBinding, com.metinozcura.rickandmorty.ui.main.MainViewModel> {
    private final kotlin.Lazy mainViewModel$delegate = null;
    private androidx.lifecycle.LiveData<androidx.navigation.NavController> currentNavController;
    
    public MainActivity() {
        super();
    }
    
    private final com.metinozcura.rickandmorty.ui.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.metinozcura.rickandmorty.ui.main.MainViewModel getVM() {
        return null;
    }
    
    @java.lang.Override()
    public void bindVM(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.databinding.ActivityMainBinding binding, @org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.ui.main.MainViewModel vm) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBottomNavigationBar() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    /**
     * Overriding popBackStack is necessary in this case if the app is started from the deep link.
     */
    @java.lang.Override()
    public void onBackPressed() {
    }
}