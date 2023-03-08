// Generated by Dagger (https://dagger.dev).
package com.yassir.movies.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesOkhttpFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  public NetworkModule_ProvidesOkhttpFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return providesOkhttp(module);
  }

  public static NetworkModule_ProvidesOkhttpFactory create(NetworkModule module) {
    return new NetworkModule_ProvidesOkhttpFactory(module);
  }

  public static OkHttpClient providesOkhttp(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesOkhttp());
  }
}