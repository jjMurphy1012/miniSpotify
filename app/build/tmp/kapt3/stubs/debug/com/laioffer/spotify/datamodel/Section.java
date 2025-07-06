package com.laioffer.spotify.datamodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/laioffer/spotify/datamodel/Section;", "Ljava/io/Serializable;", "sectionTitle", "", "albums", "", "Lcom/laioffer/spotify/datamodel/Album;", "(Ljava/lang/String;Ljava/util/List;)V", "getAlbums", "()Ljava/util/List;", "getSectionTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
public final class Section implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "section_title")
    private final java.lang.String sectionTitle = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.laioffer.spotify.datamodel.Album> albums = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.laioffer.spotify.datamodel.Section copy(@org.jetbrains.annotations.NotNull
    java.lang.String sectionTitle, @org.jetbrains.annotations.NotNull
    java.util.List<com.laioffer.spotify.datamodel.Album> albums) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Section(@org.jetbrains.annotations.NotNull
    java.lang.String sectionTitle, @org.jetbrains.annotations.NotNull
    java.util.List<com.laioffer.spotify.datamodel.Album> albums) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSectionTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.laioffer.spotify.datamodel.Album> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.laioffer.spotify.datamodel.Album> getAlbums() {
        return null;
    }
}