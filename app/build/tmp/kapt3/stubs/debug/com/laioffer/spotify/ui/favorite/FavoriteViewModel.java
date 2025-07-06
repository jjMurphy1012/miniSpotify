package com.laioffer.spotify.ui.favorite;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/laioffer/spotify/ui/favorite/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "favoriteAlbumRepository", "Lcom/laioffer/spotify/repository/FavoriteAlbumRepository;", "(Lcom/laioffer/spotify/repository/FavoriteAlbumRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/laioffer/spotify/ui/favorite/FavoriteUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "app_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    private final com.laioffer.spotify.repository.FavoriteAlbumRepository favoriteAlbumRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.laioffer.spotify.ui.favorite.FavoriteUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.laioffer.spotify.ui.favorite.FavoriteUiState> uiState = null;
    
    @javax.inject.Inject
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.repository.FavoriteAlbumRepository favoriteAlbumRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.laioffer.spotify.ui.favorite.FavoriteUiState> getUiState() {
        return null;
    }
}