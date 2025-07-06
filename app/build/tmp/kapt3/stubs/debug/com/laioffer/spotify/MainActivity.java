package com.laioffer.spotify;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/laioffer/spotify/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "api", "Lcom/laioffer/spotify/network/NetworkApi;", "getApi", "()Lcom/laioffer/spotify/network/NetworkApi;", "setApi", "(Lcom/laioffer/spotify/network/NetworkApi;)V", "databaseDao", "Lcom/laioffer/spotify/database/DatabaseDao;", "getDatabaseDao", "()Lcom/laioffer/spotify/database/DatabaseDao;", "setDatabaseDao", "(Lcom/laioffer/spotify/database/DatabaseDao;)V", "playerViewModel", "Lcom/laioffer/spotify/player/PlayerViewModel;", "getPlayerViewModel", "()Lcom/laioffer/spotify/player/PlayerViewModel;", "playerViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject
    public com.laioffer.spotify.network.NetworkApi api;
    @javax.inject.Inject
    public com.laioffer.spotify.database.DatabaseDao databaseDao;
    private final kotlin.Lazy playerViewModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.laioffer.spotify.network.NetworkApi getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.network.NetworkApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.laioffer.spotify.database.DatabaseDao getDatabaseDao() {
        return null;
    }
    
    public final void setDatabaseDao(@org.jetbrains.annotations.NotNull
    com.laioffer.spotify.database.DatabaseDao p0) {
    }
    
    private final com.laioffer.spotify.player.PlayerViewModel getPlayerViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}