package com.metinozcura.rickandmorty.data.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/metinozcura/rickandmorty/data/service/LocationApi;", "", "getAllLocations", "Lretrofit2/Response;", "Lcom/metinozcura/rickandmorty/data/model/PagedResponse;", "Lcom/metinozcura/rickandmorty/data/model/Location;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LocationApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "location/")
    public abstract java.lang.Object getAllLocations(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.metinozcura.rickandmorty.data.model.PagedResponse<com.metinozcura.rickandmorty.data.model.Location>>> continuation);
}