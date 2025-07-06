package com.laioffer.spotify.player;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u000eJ\u0006\u0010\u001b\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/laioffer/spotify/player/PlayerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/android/exoplayer2/Player$Listener;", "exoPlayer", "Lcom/google/android/exoplayer2/ExoPlayer;", "(Lcom/google/android/exoplayer2/ExoPlayer;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/laioffer/spotify/player/PlayerUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "load", "", "song", "Lcom/laioffer/spotify/datamodel/Song;", "album", "Lcom/laioffer/spotify/datamodel/Album;", "onCleared", "onIsPlayingChanged", "isPlaying", "", "onPlayerError", "error", "Lcom/google/android/exoplayer2/PlaybackException;", "pause", "play", "seekTo", "positionMs", "", "app_debug"})
public final class PlayerViewModel extends androidx.lifecycle.ViewModel implements com.google.android.exoplayer2.Player.Listener {
    private final com.google.android.exoplayer2.ExoPlayer exoPlayer = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.laioffer.spotify.player.PlayerUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.laioffer.spotify.player.PlayerUiState> uiState = null;
    
    @javax.inject.Inject
    public PlayerViewModel(@org.jetbrains.annotations.NotNull
    com.google.android.exoplayer2.ExoPlayer exoPlayer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.laioffer.spotify.player.PlayerUiState> getUiState() {
        return null;
    }
    
    public final void load(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.datamodel.Song song, @org.jetbrains.annotations.NotNull
    com.laioffer.spotify.datamodel.Album album) {
    }
    
    public final void play() {
    }
    
    public final void pause() {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @java.lang.Override
    public void onIsPlayingChanged(boolean isPlaying) {
    }
    
    @java.lang.Override
    public void onPlayerError(@org.jetbrains.annotations.NotNull
    com.google.android.exoplayer2.PlaybackException error) {
    }
    
    public final void seekTo(long positionMs) {
    }
}