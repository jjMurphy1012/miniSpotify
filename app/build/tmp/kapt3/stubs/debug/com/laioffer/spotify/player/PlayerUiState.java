package com.laioffer.spotify.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J?\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/laioffer/spotify/player/PlayerUiState;", "", "album", "Lcom/laioffer/spotify/datamodel/Album;", "song", "Lcom/laioffer/spotify/datamodel/Song;", "isPlaying", "", "currentMs", "", "durationMs", "(Lcom/laioffer/spotify/datamodel/Album;Lcom/laioffer/spotify/datamodel/Song;ZJJ)V", "getAlbum", "()Lcom/laioffer/spotify/datamodel/Album;", "getCurrentMs", "()J", "getDurationMs", "()Z", "getSong", "()Lcom/laioffer/spotify/datamodel/Song;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class PlayerUiState {
    @org.jetbrains.annotations.Nullable
    private final com.laioffer.spotify.datamodel.Album album = null;
    @org.jetbrains.annotations.Nullable
    private final com.laioffer.spotify.datamodel.Song song = null;
    private final boolean isPlaying = false;
    private final long currentMs = 0L;
    private final long durationMs = 0L;
    
    @org.jetbrains.annotations.NotNull
    public final com.laioffer.spotify.player.PlayerUiState copy(@org.jetbrains.annotations.Nullable
    com.laioffer.spotify.datamodel.Album album, @org.jetbrains.annotations.Nullable
    com.laioffer.spotify.datamodel.Song song, boolean isPlaying, long currentMs, long durationMs) {
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
    
    public PlayerUiState() {
        super();
    }
    
    public PlayerUiState(@org.jetbrains.annotations.Nullable
    com.laioffer.spotify.datamodel.Album album, @org.jetbrains.annotations.Nullable
    com.laioffer.spotify.datamodel.Song song, boolean isPlaying, long currentMs, long durationMs) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.laioffer.spotify.datamodel.Album component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.laioffer.spotify.datamodel.Album getAlbum() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.laioffer.spotify.datamodel.Song component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.laioffer.spotify.datamodel.Song getSong() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isPlaying() {
        return false;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getCurrentMs() {
        return 0L;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getDurationMs() {
        return 0L;
    }
}