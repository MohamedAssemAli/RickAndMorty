package com.metinozcura.rickandmorty;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.metinozcura.rickandmorty.databinding.ActivityMainBindingImpl;
import com.metinozcura.rickandmorty.databinding.FragmentCharacterDetailBindingImpl;
import com.metinozcura.rickandmorty.databinding.FragmentCharactersBindingImpl;
import com.metinozcura.rickandmorty.databinding.FragmentEpisodesBindingImpl;
import com.metinozcura.rickandmorty.databinding.FragmentLocationsBindingImpl;
import com.metinozcura.rickandmorty.databinding.ItemCharacterBindingImpl;
import com.metinozcura.rickandmorty.databinding.ItemEpisodeBindingImpl;
import com.metinozcura.rickandmorty.databinding.ItemLocationBindingImpl;
import com.metinozcura.rickandmorty.databinding.ItemNetworkStateBindingImpl;
import com.metinozcura.rickandmorty.databinding.ItemSeparatorLocationBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTCHARACTERDETAIL = 2;

  private static final int LAYOUT_FRAGMENTCHARACTERS = 3;

  private static final int LAYOUT_FRAGMENTEPISODES = 4;

  private static final int LAYOUT_FRAGMENTLOCATIONS = 5;

  private static final int LAYOUT_ITEMCHARACTER = 6;

  private static final int LAYOUT_ITEMEPISODE = 7;

  private static final int LAYOUT_ITEMLOCATION = 8;

  private static final int LAYOUT_ITEMNETWORKSTATE = 9;

  private static final int LAYOUT_ITEMSEPARATORLOCATION = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.metinozcura.rickandmorty.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.metinozcura.rickandmorty.R.layout.fragment_character_detail, LAYOUT_FRAGMENTCHARACTERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.metinozcura.rickandmorty.R.layout.fragment_characters, LAYOUT_FRAGMENTCHARACTERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.metinozcura.rickandmorty.R.layout.fragment_episodes, LAYOUT_FRAGMENTEPISODES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.metinozcura.rickandmorty.R.layout.fragment_locations, LAYOUT_FRAGMENTLOCATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.metinozcura.rickandmorty.R.layout.item_character, LAYOUT_ITEMCHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.metinozcura.rickandmorty.R.layout.item_episode, LAYOUT_ITEMEPISODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.metinozcura.rickandmorty.R.layout.item_location, LAYOUT_ITEMLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.metinozcura.rickandmorty.R.layout.item_network_state, LAYOUT_ITEMNETWORKSTATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.metinozcura.rickandmorty.R.layout.item_separator_location, LAYOUT_ITEMSEPARATORLOCATION);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHARACTERDETAIL: {
          if ("layout/fragment_character_detail_0".equals(tag)) {
            return new FragmentCharacterDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_character_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHARACTERS: {
          if ("layout/fragment_characters_0".equals(tag)) {
            return new FragmentCharactersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_characters is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEPISODES: {
          if ("layout/fragment_episodes_0".equals(tag)) {
            return new FragmentEpisodesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_episodes is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOCATIONS: {
          if ("layout/fragment_locations_0".equals(tag)) {
            return new FragmentLocationsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_locations is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHARACTER: {
          if ("layout/item_character_0".equals(tag)) {
            return new ItemCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_character is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMEPISODE: {
          if ("layout/item_episode_0".equals(tag)) {
            return new ItemEpisodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_episode is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLOCATION: {
          if ("layout/item_location_0".equals(tag)) {
            return new ItemLocationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_location is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNETWORKSTATE: {
          if ("layout/item_network_state_0".equals(tag)) {
            return new ItemNetworkStateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_network_state is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEPARATORLOCATION: {
          if ("layout/item_separator_location_0".equals(tag)) {
            return new ItemSeparatorLocationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_separator_location is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "character");
      sKeys.put(2, "episode");
      sKeys.put(3, "location");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_main_0", com.metinozcura.rickandmorty.R.layout.activity_main);
      sKeys.put("layout/fragment_character_detail_0", com.metinozcura.rickandmorty.R.layout.fragment_character_detail);
      sKeys.put("layout/fragment_characters_0", com.metinozcura.rickandmorty.R.layout.fragment_characters);
      sKeys.put("layout/fragment_episodes_0", com.metinozcura.rickandmorty.R.layout.fragment_episodes);
      sKeys.put("layout/fragment_locations_0", com.metinozcura.rickandmorty.R.layout.fragment_locations);
      sKeys.put("layout/item_character_0", com.metinozcura.rickandmorty.R.layout.item_character);
      sKeys.put("layout/item_episode_0", com.metinozcura.rickandmorty.R.layout.item_episode);
      sKeys.put("layout/item_location_0", com.metinozcura.rickandmorty.R.layout.item_location);
      sKeys.put("layout/item_network_state_0", com.metinozcura.rickandmorty.R.layout.item_network_state);
      sKeys.put("layout/item_separator_location_0", com.metinozcura.rickandmorty.R.layout.item_separator_location);
    }
  }
}
