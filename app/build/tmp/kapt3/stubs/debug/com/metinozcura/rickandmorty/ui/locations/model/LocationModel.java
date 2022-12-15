package com.metinozcura.rickandmorty.ui.locations.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/locations/model/LocationModel;", "", "()V", "LocationData", "LocationSeparator", "Lcom/metinozcura/rickandmorty/ui/locations/model/LocationModel$LocationData;", "Lcom/metinozcura/rickandmorty/ui/locations/model/LocationModel$LocationSeparator;", "app_debug"})
public abstract class LocationModel {
    
    private LocationModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B5\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f\u00a2\u0006\u0002\u0010\rR\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/locations/model/LocationModel$LocationData;", "Lcom/metinozcura/rickandmorty/ui/locations/model/LocationModel;", "location", "Lcom/metinozcura/rickandmorty/data/model/Location;", "(Lcom/metinozcura/rickandmorty/data/model/Location;)V", "id", "", "name", "", "type", "dimension", "residence", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDimension", "()Ljava/lang/String;", "getId", "()I", "getName", "getResidence", "()Ljava/util/List;", "getType", "app_debug"})
    public static final class LocationData extends com.metinozcura.rickandmorty.ui.locations.model.LocationModel {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String dimension = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<java.lang.String> residence = null;
        
        public LocationData(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String type, @org.jetbrains.annotations.NotNull()
        java.lang.String dimension, @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> residence) {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDimension() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getResidence() {
            return null;
        }
        
        public LocationData(@org.jetbrains.annotations.NotNull()
        com.metinozcura.rickandmorty.data.model.Location location) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/metinozcura/rickandmorty/ui/locations/model/LocationModel$LocationSeparator;", "Lcom/metinozcura/rickandmorty/ui/locations/model/LocationModel;", "tag", "", "(Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "app_debug"})
    public static final class LocationSeparator extends com.metinozcura.rickandmorty.ui.locations.model.LocationModel {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tag = null;
        
        public LocationSeparator(@org.jetbrains.annotations.NotNull()
        java.lang.String tag) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTag() {
            return null;
        }
    }
}