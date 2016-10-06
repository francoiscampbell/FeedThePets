package xyz.fcampbell.feedthepets.di.main_activity

import android.support.v7.widget.LinearLayoutManager
import dagger.Component
import xyz.fcampbell.feedthepets.di.app.AppComponent
import xyz.fcampbell.feedthepets.view.PetAdapter

/**
 * Created by francois on 2016-10-05.
 */
@Component(modules = arrayOf(MainActivityModule::class), dependencies = arrayOf(AppComponent::class))
@MainActivityScope
interface MainActivityComponent {
    fun petAdapter(): PetAdapter
    fun linearLayoutManager(): LinearLayoutManager
}