package xyz.fcampbell.feedthepets.di.app

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by francois on 2016-10-05.
 */
@Module
class AppModule(
        private val app: Application
) {
    @Provides
    @Singleton
    fun provideApp(): Application = app

    @Provides
    @Singleton
    fun provideAppContext(): Context = app
}