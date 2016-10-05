package xyz.fcampbell.feedthepets.di.app

import android.app.Application
import dagger.Component
import javax.inject.Singleton

/**
 * Created by francois on 2016-10-05.
 */
@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent {
    fun app(): Application
}