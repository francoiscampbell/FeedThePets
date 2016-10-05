package xyz.fcampbell.feedthepets.di.main_activity

import dagger.Component

/**
 * Created by francois on 2016-10-05.
 */
@Component(modules = arrayOf(MainActivityModule::class))
@MainActivityScope
interface MainActivityComponent {
}