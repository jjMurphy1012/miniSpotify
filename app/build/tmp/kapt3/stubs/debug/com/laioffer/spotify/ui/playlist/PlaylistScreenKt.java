package com.laioffer.spotify.ui.playlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u001a4\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a@\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u001a,\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u00a8\u0006\u001c"}, d2 = {"Cover", "", "album", "Lcom/laioffer/spotify/datamodel/Album;", "isFavorite", "", "onTapFavorite", "Lkotlin/Function1;", "PlaylistContent", "playlist", "", "Lcom/laioffer/spotify/datamodel/Song;", "currentSong", "onTapSong", "PlaylistHeader", "PlaylistScreen", "playlistViewModel", "Lcom/laioffer/spotify/ui/playlist/PlaylistViewModel;", "playerViewModel", "Lcom/laioffer/spotify/player/PlayerViewModel;", "PlaylistScreenContent", "playlistUiState", "Lcom/laioffer/spotify/ui/playlist/PlaylistUiState;", "playerUiState", "Lcom/laioffer/spotify/player/PlayerUiState;", "Song", "song", "isPlaying", "app_debug"})
public final class PlaylistScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void PlaylistScreen(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.ui.playlist.PlaylistViewModel playlistViewModel, @org.jetbrains.annotations.NotNull
    com.laioffer.spotify.player.PlayerViewModel playerViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void PlaylistScreenContent(com.laioffer.spotify.ui.playlist.PlaylistUiState playlistUiState, com.laioffer.spotify.player.PlayerUiState playerUiState, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onTapFavorite, kotlin.jvm.functions.Function1<? super com.laioffer.spotify.datamodel.Song, kotlin.Unit> onTapSong) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void PlaylistHeader(com.laioffer.spotify.datamodel.Album album) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void PlaylistContent(java.util.List<com.laioffer.spotify.datamodel.Song> playlist, com.laioffer.spotify.datamodel.Song currentSong, kotlin.jvm.functions.Function1<? super com.laioffer.spotify.datamodel.Song, kotlin.Unit> onTapSong) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void Song(com.laioffer.spotify.datamodel.Song song, boolean isPlaying, kotlin.jvm.functions.Function1<? super com.laioffer.spotify.datamodel.Song, kotlin.Unit> onTapSong) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void Cover(com.laioffer.spotify.datamodel.Album album, boolean isFavorite, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onTapFavorite) {
    }
}