package com.metinozcura.rickandmorty.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"loadImage", "", "Landroid/widget/ImageView;", "url", "", "status", "Lcom/google/android/material/textview/MaterialTextView;", "Lcom/metinozcura/rickandmorty/data/model/Status;", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImage, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"status"})
    public static final void status(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textview.MaterialTextView $this$status, @org.jetbrains.annotations.NotNull()
    com.metinozcura.rickandmorty.data.model.Status status) {
    }
}