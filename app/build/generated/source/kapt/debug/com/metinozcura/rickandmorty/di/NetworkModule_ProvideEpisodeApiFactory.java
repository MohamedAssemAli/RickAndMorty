// Generated by Dagger (https://dagger.dev).
package com.metinozcura.rickandmorty.di;

import com.metinozcura.rickandmorty.data.service.EpisodeApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideEpisodeApiFactory implements Factory<EpisodeApi> {
  private final NetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideEpisodeApiFactory(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public EpisodeApi get() {
    return provideEpisodeApi(module, retrofitProvider.get());
  }

  public static NetworkModule_ProvideEpisodeApiFactory create(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideEpisodeApiFactory(module, retrofitProvider);
  }

  public static EpisodeApi provideEpisodeApi(NetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideEpisodeApi(retrofit));
  }
}
