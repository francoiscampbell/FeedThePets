package xyz.fcampbell.feedthepets.di.main_activity

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import dagger.Module
import dagger.Provides

/**
 * Created by francois on 2016-10-05.
 */
@Module
class MainActivityModule {
    @Provides
    @MainActivityScope
    fun provideLinearLayoutManager(context: Context) = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
}