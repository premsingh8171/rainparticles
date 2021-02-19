//package com.premsinghdaksha.rain_particles.psd.settings
//
//import androidx.annotation.DrawableRes
//import androidx.annotation.StringRes
//import com.premsinghdaksha.rain_particles.R
//import com.premsinghdaksha.rain_particles.psd.models.Shape
//
//
///**
// * Created by dionsegijn on 5/21/17.
// */
//open class Configuration(
//        val type: Int,
//        val title: String,
//        @StringRes val instructions: Int,
//        @DrawableRes val vector: Int) {
//
//    companion object {
//        @JvmStatic
//        val TYPE_STREAM_FROM_TOP: Int = 0
//        @JvmStatic
//        val TYPE_DRAG_AND_SHOOT: Int = 1
//        @JvmStatic
//        val TYPE_BURST_FROM_CENTER: Int = 2
//    }
//
//    var timeToLive: Long = 2000
//    var minSpeed: Float = 4f
//    var maxSpeed: Float = 7f
//    var colors = intArrayOf(RA.color.lt_yellow, R.color.lt_orange, R.color.lt_purple, R.color.lt_pink)
//    var shapes: Array<Shape> = arrayOf(Shape.Square, Shape.Circle)
//}
