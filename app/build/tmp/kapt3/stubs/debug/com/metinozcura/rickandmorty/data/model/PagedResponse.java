package com.metinozcura.rickandmorty.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u00c6\u0003J)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/metinozcura/rickandmorty/data/model/PagedResponse;", "T", "", "pageInfo", "Lcom/metinozcura/rickandmorty/data/model/PageInfo;", "results", "", "(Lcom/metinozcura/rickandmorty/data/model/PageInfo;Ljava/util/List;)V", "getPageInfo", "()Lcom/metinozcura/rickandmorty/data/model/PageInfo;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class PagedResponse<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "info")
    private final com.metinozcura.rickandmorty.data.model.PageInfo pageInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> results = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.metinozcura.rickandmorty.data.model.PagedResponse<T> copy(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.data.model.PageInfo pageInfo, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> results) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PagedResponse(@org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.data.model.PageInfo pageInfo, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> results) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metinozcura.rickandmorty.data.model.PageInfo component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metinozcura.rickandmorty.data.model.PageInfo getPageInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getResults() {
        return null;
    }
}