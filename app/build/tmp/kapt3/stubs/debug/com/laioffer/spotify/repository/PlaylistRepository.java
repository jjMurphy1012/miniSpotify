package com.laioffer.spotify.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/laioffer/spotify/repository/PlaylistRepository;", "", "networkApi", "Lcom/laioffer/spotify/network/NetworkApi;", "(Lcom/laioffer/spotify/network/NetworkApi;)V", "getPlaylist", "Lcom/laioffer/spotify/datamodel/Playlist;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PlaylistRepository {
    private final com.laioffer.spotify.network.NetworkApi networkApi = null;
    
    @javax.inject.Inject
    public PlaylistRepository(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.network.NetworkApi networkApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPlaylist(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.laioffer.spotify.datamodel.Playlist> continuation) {
        return null;
    }
}