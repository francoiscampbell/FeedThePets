package xyz.fcampbell.feedthepets

import android.app.Application
import xyz.fcampbell.feedthepets.di.app.AppComponent
import xyz.fcampbell.feedthepets.di.app.AppModule
import xyz.fcampbell.feedthepets.di.app.DaggerAppComponent

/**
 * Created by francois on 2016-10-06.
 */
class PetApp : Application() {
    override fun onCreate() {
        super.onCreate()

        COMPONENT = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    companion object {
        lateinit var COMPONENT: AppComponent
    }
}