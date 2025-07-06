package com.laioffer.spotify.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a$\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a$\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a$\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u000f\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0003\u00a8\u0006\u0013"}, d2 = {"AlbumCover", "", "album", "Lcom/laioffer/spotify/datamodel/Album;", "onTap", "Lkotlin/Function1;", "AlbumSection", "section", "Lcom/laioffer/spotify/datamodel/Section;", "HomeScreen", "viewModel", "Lcom/laioffer/spotify/ui/home/HomeViewModel;", "HomeScreenContent", "uiState", "Lcom/laioffer/spotify/ui/home/HomeUiState;", "HomeScreenHeader", "LoadingSection", "text", "", "app_debug"})
public final class HomeScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.ui.home.HomeViewModel viewModel, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.laioffer.spotify.datamodel.Album, kotlin.Unit> onTap) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void HomeScreenContent(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.ui.home.HomeUiState uiState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.laioffer.spotify.datamodel.Album, kotlin.Unit> onTap) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void AlbumSection(com.laioffer.spotify.datamodel.Section section, kotlin.jvm.functions.Function1<? super com.laioffer.spotify.datamodel.Album, kotlin.Unit> onTap) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void AlbumCover(com.laioffer.spotify.datamodel.Album album, kotlin.jvm.functions.Function1<? super com.laioffer.spotify.datamodel.Album, kotlin.Unit> onTap) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void LoadingSection(java.lang.String text) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void HomeScreenHeader() {
    }
}