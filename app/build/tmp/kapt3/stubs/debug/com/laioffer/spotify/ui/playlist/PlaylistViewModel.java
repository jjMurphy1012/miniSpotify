package com.laioffer.spotify.ui.playlist;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/laioffer/spotify/ui/playlist/PlaylistViewModel;", "Landroidx/lifecycle/ViewModel;", "playlistRepository", "Lcom/laioffer/spotify/repository/PlaylistRepository;", "favoriteAlbumRepository", "Lcom/laioffer/spotify/repository/FavoriteAlbumRepository;", "(Lcom/laioffer/spotify/repository/PlaylistRepository;Lcom/laioffer/spotify/repository/FavoriteAlbumRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/laioffer/spotify/ui/playlist/PlaylistUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchPlaylist", "", "album", "Lcom/laioffer/spotify/datamodel/Album;", "toggleFavorite", "isFavorite", "", "app_debug"})
public final class PlaylistViewModel extends androidx.lifecycle.ViewModel {
    private final com.laioffer.spotify.repository.PlaylistRepository playlistRepository = null;
    private final com.laioffer.spotify.repository.FavoriteAlbumRepository favoriteAlbumRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.laioffer.spotify.ui.playlist.PlaylistUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.laioffer.spotify.ui.playlist.PlaylistUiState> uiState = null;
    
    @javax.inject.Inject
    public PlaylistViewModel(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.repository.PlaylistRepository playlistRepository, @org.jetbrains.annotations.NotNull
    com.laioffer.spotify.repository.FavoriteAlbumRepository favoriteAlbumRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.laioffer.spotify.ui.playlist.PlaylistUiState> getUiState() {
        return null;
    }
    
    public final void fetchPlaylist(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.datamodel.Album album) {
    }
    
    public final void toggleFavorite(boolean isFavorite) {
    }
}