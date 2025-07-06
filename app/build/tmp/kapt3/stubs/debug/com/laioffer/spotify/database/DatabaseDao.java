package com.laioffer.spotify.database;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/laioffer/spotify/database/DatabaseDao;", "", "favoriteAlbum", "", "album", "Lcom/laioffer/spotify/datamodel/Album;", "fetchFavoriteAlbums", "Lkotlinx/coroutines/flow/Flow;", "", "isFavoriteAlbum", "", "id", "", "unFavoriteAlbum", "app_debug"})
public abstract interface DatabaseDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void favoriteAlbum(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.datamodel.Album album);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT EXISTS(SELECT * FROM Album WHERE id = :id)")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> isFavoriteAlbum(int id);
    
    @androidx.room.Delete
    public abstract void unFavoriteAlbum(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.datamodel.Album album);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "select * from Album")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.laioffer.spotify.datamodel.Album>> fetchFavoriteAlbums();
}