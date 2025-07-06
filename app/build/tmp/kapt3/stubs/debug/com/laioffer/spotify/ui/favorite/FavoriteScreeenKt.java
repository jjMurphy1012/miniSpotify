package com.laioffer.spotify.ui.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a$\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a*\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u00a8\u0006\f"}, d2 = {"FavoriteAlbumRow", "", "album", "Lcom/laioffer/spotify/datamodel/Album;", "onTap", "Lkotlin/Function1;", "FavoriteScreen", "viewModel", "Lcom/laioffer/spotify/ui/favorite/FavoriteViewModel;", "FavoriteScreenContent", "albums", "", "app_debug"})
public final class FavoriteScreeenKt {
    
    @androidx.compose.runtime.Composable
    public static final void FavoriteScreen(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.ui.favorite.FavoriteViewModel viewModel, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.laioffer.spotify.datamodel.Album, kotlin.Unit> onTap) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void FavoriteScreenContent(java.util.List<com.laioffer.spotify.datamodel.Album> albums, kotlin.jvm.functions.Function1<? super com.laioffer.spotify.datamodel.Album, kotlin.Unit> onTap) {
    }
    
    /**
     * alternative
     * @Composable
     * private fun FavoriteScreenContent(albums: List<Album>, onTap: (Album) -> Unit) {
     * Column(modifier = Modifier.padding(16.dp)) {
     * Text(
     * stringResource(id = R.string.menu_favorite),
     * style = MaterialTheme.typography.h4,
     * color = Color.White
     * )
     * Spacer(modifier = Modifier.height(16.dp))
     *
     * LazyColumn {
     * items(albums) { album ->
     * FavoriteAlbumRow(
     * album = album,
     * onTap = onTap
     * )
     * }
     *
     * }
     * }
     * }
     */
    @androidx.compose.runtime.Composable
    private static final void FavoriteAlbumRow(com.laioffer.spotify.datamodel.Album album, kotlin.jvm.functions.Function1<? super com.laioffer.spotify.datamodel.Album, kotlin.Unit> onTap) {
    }
}