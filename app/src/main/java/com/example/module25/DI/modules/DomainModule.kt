package com.example.module25.DI.modules

import com.example.module25.TmdbApi
import com.example.module25.data.MainRepository
import com.example.module25.domain.Interactor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DomainModule {
    @Singleton
    @Provides
    fun provideInteractor(repository: MainRepository, tmdbApi: TmdbApi) = Interactor(repo = repository, retrofitService = tmdbApi)
}