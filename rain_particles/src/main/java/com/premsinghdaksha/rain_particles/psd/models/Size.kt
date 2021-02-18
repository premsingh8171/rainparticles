package com.premsinghdaksha.rain_particles.psd.models

import android.content.res.Resources
/*
* Created by Prem singh daksha.
*/

data class Size(val sizeInDp: Int, val mass: Float = 5f) {

    internal val sizeInPx: Float
        get() = sizeInDp * Resources.getSystem().displayMetrics.density

    init {
        require(mass != 0F) { "mass=$mass must be != 0" }
    }
}
