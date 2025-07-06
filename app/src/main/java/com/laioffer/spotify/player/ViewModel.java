package com.laioffer.spotify.player;

import android.os.Build;

import java.util.HashSet;
import java.util.Set;

public class ViewModel implements ExoPlayer.Listener {
    private ExoPlayer player;
    private int a;


    void init() {
        player.addListener(this);
    }
}

class ExoPlayer {
    private HashSet<Listener> listeners = new HashSet();

    void addListener(Listener listener) {
        listeners.add(listener);
    }

    void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    private void play() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            listeners.forEach(Listener::onIsPlayingChanged);
        }
    }

    interface Listener {
        default void onIsPlayingChanged() {}
    }

}

