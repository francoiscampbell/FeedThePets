package xyz.fcampbell.feedthepets.view.model

import java.util.*

/**
 * Created by francois on 2016-10-05.
 */
data class PetAction(
        var done: Boolean = false,
        val timeOfDay: Date = Date(),
        val text: String = ""
)