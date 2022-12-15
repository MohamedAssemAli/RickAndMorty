package com.metinozcura.rickandmorty.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001a*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0012J\r\u0010\u0013\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0010J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0006\u0010\u0019\u001a\u00020\u0010R\u0010\u0010\u0007\u001a\u00028\u0000X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\n8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00028\u0001X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/metinozcura/rickandmorty/base/BaseActivity;", "DB", "Landroidx/databinding/ViewDataBinding;", "VM", "Lcom/metinozcura/rickandmorty/base/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Landroidx/databinding/ViewDataBinding;", "layoutId", "", "getLayoutId", "()I", "viewModel", "Lcom/metinozcura/rickandmorty/base/BaseViewModel;", "bindVM", "", "vm", "(Landroidx/databinding/ViewDataBinding;Lcom/metinozcura/rickandmorty/base/BaseViewModel;)V", "getVM", "()Lcom/metinozcura/rickandmorty/base/BaseViewModel;", "hideProgress", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showProgress", "Companion", "app_debug"})
public abstract class BaseActivity<DB extends androidx.databinding.ViewDataBinding, VM extends com.metinozcura.rickandmorty.base.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity {
    private VM viewModel;
    private DB binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.metinozcura.rickandmorty.base.BaseActivity.Companion Companion = null;
    private static final java.lang.String PROGRESS = "Progress";
    
    public BaseActivity() {
        super();
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract VM getVM();
    
    public abstract void bindVM(@org.jetbrains.annotations.NotNull()
    DB binding, @org.jetbrains.annotations.NotNull()
    VM vm);
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showProgress() {
    }
    
    public final void hideProgress() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/metinozcura/rickandmorty/base/BaseActivity$Companion;", "", "()V", "PROGRESS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}