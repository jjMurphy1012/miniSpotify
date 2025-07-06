package com.laioffer.spotify.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/laioffer/spotify/repository/FavoriteAlbumRepository;", "", "databaseDao", "Lcom/laioffer/spotify/database/DatabaseDao;", "(Lcom/laioffer/spotify/database/DatabaseDao;)V", "favoriteAlbum", "", "album", "Lcom/laioffer/spotify/datamodel/Album;", "(Lcom/laioffer/spotify/datamodel/Album;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFavoriteAlbums", "Lkotlinx/coroutines/flow/Flow;", "", "isFavoriteAlbum", "", "id", "", "unFavoriteAlbum", "app_debug"})
public final class FavoriteAlbumRepository {
    private final com.laioffer.spotify.database.DatabaseDao databaseDao = null;
    
    @javax.inject.Inject
    public FavoriteAlbumRepository(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.database.DatabaseDao databaseDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isFavoriteAlbum(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object favoriteAlbum(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.datamodel.Album album, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object unFavoriteAlbum(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.datamodel.Album album, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.laioffer.spotify.datamodel.Album>> fetchFavoriteAlbums() {
        return null;
    }
}