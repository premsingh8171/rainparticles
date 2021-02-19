package com.premsinghdaksha.rainparticlesdemo

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.premsinghdaksha.rain_particles.psd.models.Shape
import com.premsinghdaksha.rain_particles.psd.models.Size
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val top = top;
        val center_blast = blast;
        val rainparticlesview = rainparticlesview

        top.setOnClickListener {
            rainparticlesfromtop()
        }

        center_blast.setOnClickListener {
            blastrainparticles()
        }
    }

    @SuppressLint("ResourceType")
    private fun blastrainparticles() {
        rainparticlesview.build()
            .addColors(
                Color.parseColor(getString(R.color.lt_yellow)),
                Color.parseColor(getString(R.color.lt_orange)),
                Color.parseColor(getString(R.color.lt_purple)),
                Color.parseColor(getString(R.color.lt_pink)),
                Color.parseColor(getString(R.color.dk_cyan)),
                Color.parseColor(getString(R.color.dk_green)),
                Color.parseColor(getString(R.color.dk_red)),
                Color.parseColor(getString(R.color.dk_blue)),
                Color.parseColor(getString(R.color.teal_200))
            )
            .setDirection(0.0, 359.0)
            .setSpeed(1f, 5f)
            .setFadeOutEnabled(true)
            .setTimeToLive(2000L)
            .addShapes(Shape.Circle)
            .addSizes(Size(12))
            .setPosition(
                0f,
                rainparticlesview.width + 1f,
                (rainparticlesview.height) / 2f,
                (rainparticlesview.height) / 2f
            )
            .burst(1000)


    }

    @SuppressLint("ResourceType")
    private fun rainparticlesfromtop() {
        rainparticlesview.build()
            .addColors(
                Color.parseColor(getString(R.color.lt_yellow)),
                Color.parseColor(getString(R.color.lt_orange)),
                Color.parseColor(getString(R.color.lt_purple)),
                Color.parseColor(getString(R.color.lt_pink)),
                Color.parseColor(getString(R.color.dk_cyan)),
                Color.parseColor(getString(R.color.dk_green)),
                Color.parseColor(getString(R.color.dk_red)),
                Color.parseColor(getString(R.color.dk_blue)),
                Color.parseColor(getString(R.color.teal_200))
            )
            .setDirection(0.0, 359.0)
            .setSpeed(1f, 5f)
            .setFadeOutEnabled(true)
            .setTimeToLive(2000L)
            .addShapes(Shape.Circle)
            .addSizes(Size(12))
            .setPosition(-50f, rainparticlesview.width + 50f, -50f, -50f)
            .streamFor(300, 5000L)
    }

}