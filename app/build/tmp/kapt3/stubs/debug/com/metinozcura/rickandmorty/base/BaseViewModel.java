package com.metinozcura.rickandmorty.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J`\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00102$\b\u0004\u0010\u0011\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00122\u0014\b\u0004\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u000f0\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u000bH\u0086\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0018J\\\u0010\u0019\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00102$\b\u0004\u0010\u0011\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u001a0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00122\u001a\b\u0004\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u001a\u0012\u0004\u0012\u00020\u000f0\u0012H\u0086\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u001bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001\u00a8\u0006\u001c"}, d2 = {"Lcom/metinozcura/rickandmorty/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorMessage", "Lcom/metinozcura/rickandmorty/util/SingleLiveEvent;", "", "getErrorMessage", "()Lcom/metinozcura/rickandmorty/util/SingleLiveEvent;", "setErrorMessage", "(Lcom/metinozcura/rickandmorty/util/SingleLiveEvent;)V", "progressLiveEvent", "", "getProgressLiveEvent", "setProgressLiveEvent", "launchAsync", "", "T", "execute", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "", "onSuccess", "showProgress", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "launchPagingAsync", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.metinozcura.rickandmorty.util.SingleLiveEvent<java.lang.Boolean> progressLiveEvent;
    @org.jetbrains.annotations.NotNull()
    private com.metinozcura.rickandmorty.util.SingleLiveEvent<java.lang.String> errorMessage;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metinozcura.rickandmorty.util.SingleLiveEvent<java.lang.Boolean> getProgressLiveEvent() {
        return null;
    }
    
    public final void setProgressLiveEvent(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.util.SingleLiveEvent<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metinozcura.rickandmorty.util.SingleLiveEvent<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.util.SingleLiveEvent<java.lang.String> p0) {
    }
    
    public final <T extends java.lang.Object>void launchAsync(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> execute, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess, boolean showProgress) {
    }
    
    public final <T extends java.lang.Object>void launchPagingAsync(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends T>>, ? extends java.lang.Object> execute, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlinx.coroutines.flow.Flow<? extends T>, kotlin.Unit> onSuccess) {
    }
}