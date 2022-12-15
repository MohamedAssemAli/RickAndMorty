package com.metinozcura.rickandmorty.ui.characters

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.metinozcura.rickandmorty.R
import com.metinozcura.rickandmorty.`data`.model.Character
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class CharactersFragmentDirections private constructor() {
  private data class ActionCharactersToCharacterDetail(
    public val character: Character
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_characters_to_characterDetail

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Character::class.java)) {
        result.putParcelable("character", this.character as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Character::class.java)) {
        result.putSerializable("character", this.character as Serializable)
      } else {
        throw UnsupportedOperationException(Character::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionCharactersToCharacterDetail(character: Character): NavDirections =
        ActionCharactersToCharacterDetail(character)
  }
}
