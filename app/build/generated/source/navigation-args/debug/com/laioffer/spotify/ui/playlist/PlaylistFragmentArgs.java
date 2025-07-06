package com.laioffer.spotify.ui.playlist;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.laioffer.spotify.datamodel.Album;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class PlaylistFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private PlaylistFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private PlaylistFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static PlaylistFragmentArgs fromBundle(@NonNull Bundle bundle) {
    PlaylistFragmentArgs __result = new PlaylistFragmentArgs();
    bundle.setClassLoader(PlaylistFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("album")) {
      Album album;
      if (Parcelable.class.isAssignableFrom(Album.class) || Serializable.class.isAssignableFrom(Album.class)) {
        album = (Album) bundle.get("album");
      } else {
        throw new UnsupportedOperationException(Album.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (album == null) {
        throw new IllegalArgumentException("Argument \"album\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("album", album);
    } else {
      throw new IllegalArgumentException("Required argument \"album\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PlaylistFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    PlaylistFragmentArgs __result = new PlaylistFragmentArgs();
    if (savedStateHandle.contains("album")) {
      Album album;
      album = savedStateHandle.get("album");
      if (album == null) {
        throw new IllegalArgumentException("Argument \"album\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("album", album);
    } else {
      throw new IllegalArgumentException("Required argument \"album\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Album getAlbum() {
    return (Album) arguments.get("album");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("album")) {
      Album album = (Album) arguments.get("album");
      if (Parcelable.class.isAssignableFrom(Album.class) || album == null) {
        __result.set("album", Parcelable.class.cast(album));
      } else if (Serializable.class.isAssignableFrom(Album.class)) {
        __result.set("album", Serializable.class.cast(album));
      } else {
        throw new UnsupportedOperationException(Album.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    PlaylistFragmentArgs that = (PlaylistFragmentArgs) object;
    if (arguments.containsKey("album") != that.arguments.containsKey("album")) {
      return false;
    }
    if (getAlbum() != null ? !getAlbum().equals(that.getAlbum()) : that.getAlbum() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getAlbum() != null ? getAlbum().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "PlaylistFragmentArgs{"
        + "album=" + getAlbum()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull PlaylistFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Album album) {
      if (album == null) {
        throw new IllegalArgumentException("Argument \"album\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("album", album);
    }

    @NonNull
    public PlaylistFragmentArgs build() {
      PlaylistFragmentArgs result = new PlaylistFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setAlbum(@NonNull Album album) {
      if (album == null) {
        throw new IllegalArgumentException("Argument \"album\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("album", album);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Album getAlbum() {
      return (Album) arguments.get("album");
    }
  }
}
