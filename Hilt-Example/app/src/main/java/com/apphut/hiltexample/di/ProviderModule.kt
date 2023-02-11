package com.apphut.hiltexample.di

import com.apphut.hiltexample.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object ProviderModule {

    // We are telling the hilt that how you can
    // create an object for UserRepository class
    @Provides
    fun provideUserRepository(
        @Named("Production") baseURL: String
    ): UserRepository {
        return UserRepository(baseURL)
    }

    // As UserRepository class depends on baseURL, so we are also
    // providing how to create baseURL string (Production)
    @Named("Production")
    @Provides
    fun provideProductionBaseURL() : String {
        return "base-url-production"
    }

    // As UserRepository class depends on baseURL, so we are also
    // providing how to create baseURL string (Stage)
    @Named("Stage")
    @Provides
    fun provideStageBaseURL() : String {
        return "base-url-stage"
    }
}