// Generated by Dagger (https://dagger.dev).
package com.metinozcura.rickandmorty.ui.characters;

import com.metinozcura.rickandmorty.data.repository.character.CharacterRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CharactersViewModel_Factory implements Factory<CharactersViewModel> {
  private final Provider<CharacterRepository> characterRepositoryProvider;

  public CharactersViewModel_Factory(Provider<CharacterRepository> characterRepositoryProvider) {
    this.characterRepositoryProvider = characterRepositoryProvider;
  }

  @Override
  public CharactersViewModel get() {
    return newInstance(characterRepositoryProvider.get());
  }

  public static CharactersViewModel_Factory create(
      Provider<CharacterRepository> characterRepositoryProvider) {
    return new CharactersViewModel_Factory(characterRepositoryProvider);
  }

  public static CharactersViewModel newInstance(CharacterRepository characterRepository) {
    return new CharactersViewModel(characterRepository);
  }
}
