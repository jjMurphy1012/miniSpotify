package com.laioffer.spotify.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/laioffer/spotify/network/NetworkApi;", "", "getHomeFeed", "Lretrofit2/Call;", "", "Lcom/laioffer/spotify/datamodel/Section;", "getPlaylist", "Lcom/laioffer/spotify/datamodel/Playlist;", "id", "", "app_debug"})
public abstract interface NetworkApi {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "feed")
    public abstract retrofit2.Call<java.util.List<com.laioffer.spotify.datamodel.Section>> getHomeFeed();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "playlist/{id}")
    public abstract retrofit2.Call<com.laioffer.spotify.datamodel.Playlist> getPlaylist(@retrofit2.http.Path(value = "id")
    int id);
}