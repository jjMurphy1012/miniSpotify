package com.laioffer.spotify.ui.home;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.laioffer.spotify.R;
import com.laioffer.spotify.datamodel.Album;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionHomeFragmentToPlaylistFragment actionHomeFragmentToPlaylistFragment(
      @NonNull Album album) {
    return new ActionHomeFragmentToPlaylistFragment(album);
  }

  public static class ActionHomeFragmentToPlaylistFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeFragmentToPlaylistFragment(@NonNull Album album) {
      if (album == null) {
        throw new IllegalArgumentException("Argument \"album\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("album", album);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToPlaylistFragment setAlbum(@NonNull Album album) {
      if (album == null) {
        throw new IllegalArgumentException("Argument \"album\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("album", album);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("album")) {
        Album album = (Album) arguments.get("album");
        if (Parcelable.class.isAssignableFrom(Album.class) || album == null) {
          __result.putParcelable("album", Parcelable.class.cast(album));
        } else if (Serializable.class.isAssignableFrom(Album.class)) {
          __result.putSerializable("album", Serializable.class.cast(album));
        } else {
          throw new UnsupportedOperationException(Album.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_playlistFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Album getAlbum() {
      return (Album) arguments.get("album");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToPlaylistFragment that = (ActionHomeFragmentToPlaylistFragment) object;
      if (arguments.containsKey("album") != that.arguments.containsKey("album")) {
        return false;
      }
      if (getAlbum() != null ? !getAlbum().equals(that.getAlbum()) : that.getAlbum() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getAlbum() != null ? getAlbum().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToPlaylistFragment(actionId=" + getActionId() + "){"
          + "album=" + getAlbum()
          + "}";
    }
  }
}
