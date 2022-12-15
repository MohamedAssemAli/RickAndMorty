package com.metinozcura.rickandmorty.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0012J\r\u0010\u0013\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0014J,\u0010\u0015\u001a\u00020\u00102\u001c\u0010\u0016\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u0010\u0010\u0007\u001a\u00028\u0000X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\n8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00028\u0001X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/metinozcura/rickandmorty/base/BaseFragment;", "DB", "Landroidx/databinding/ViewDataBinding;", "VM", "Lcom/metinozcura/rickandmorty/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Landroidx/databinding/ViewDataBinding;", "layoutId", "", "getLayoutId", "()I", "viewModel", "Lcom/metinozcura/rickandmorty/base/BaseViewModel;", "bindVM", "", "vm", "(Landroidx/databinding/ViewDataBinding;Lcom/metinozcura/rickandmorty/base/BaseViewModel;)V", "getVM", "()Lcom/metinozcura/rickandmorty/base/BaseViewModel;", "launchOnLifecycleScope", "execute", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "app_debug"})
public abstract class BaseFragment<DB extends androidx.databinding.ViewDataBinding, VM extends com.metinozcura.rickandmorty.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    private VM viewModel;
    private DB binding;
    
    public BaseFragment() {
        super();
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract VM getVM();
    
    public abstract void bindVM(@org.jetbrains.annotations.NotNull()
    DB binding, @org.jetbrains.annotations.NotNull()
    VM vm);
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void launchOnLifecycleScope(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> execute) {
    }
}