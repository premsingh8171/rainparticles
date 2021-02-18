package com.premsinghdaksha.rain_particles.psd.emitters

import android.graphics.Canvas
import com.premsinghdaksha.rain_particles.psd.Confetti
import com.premsinghdaksha.rain_particles.psd.models.RainParticlesConfig
import com.premsinghdaksha.rain_particles.psd.models.Shape
import com.premsinghdaksha.rain_particles.psd.models.Size
import com.premsinghdaksha.rain_particles.psd.models.Vector
import com.premsinghdaksha.rain_particles.psd.modules.LocationModule
import com.premsinghdaksha.rain_particles.psd.modules.VelocityModule

import java.util.Random

/**
  * Created by Prem singh daksha.
 * Implementation class for rendering confetti
 * Implementations like [BurstEmitter] and [StreamEmitter] define at
 * what rate the RainParticlesConfig is created while RenderSystem is creating the RainParticlesConfig
 * and passing through the canvas to let the confetti render itself
 */
class RenderSystem(
    private val location: LocationModule,
    private val velocity: VelocityModule,
    private val gravity: Vector,
    private val sizes: Array<Size>,
    private val shapes: Array<Shape>,
    private val colors: IntArray,
    private val config: RainParticlesConfig,
    private val emitter: Emitter,
    val createdAt: Long = System.currentTimeMillis()
) {

    /**
     * Whether the render system is allowed to add more confetti
     */
    var enabled = true

    private val random = Random()
    private val particles: MutableList<Confetti> = mutableListOf()

    init {
        emitter.addConfettiFunc = this::addConfetti
    }

    private fun addConfetti() {
        particles.add(
            Confetti(
                location = Vector(location.x, location.y),
                size = sizes[random.nextInt(sizes.size)],
                shape = getRandomShape(),
                color = colors[random.nextInt(colors.size)],
                lifespan = config.timeToLive,
                fadeOut = config.fadeOut,
                velocity = this.velocity.getVelocity(),
                rotate = config.rotate,
                maxAcceleration = velocity.maxAcceleration,
                accelerate = config.accelerate,
                rotationSpeedMultiplier = velocity.getRotationSpeedMultiplier()
            )
        )
    }

    /**
     * When the shape is a DrawableShape, mutate the drawable so that all drawables
     * have different values when drawn on the canvas.
     */
    private fun getRandomShape(): Shape {
        return when (val shape = shapes[random.nextInt(shapes.size)]) {
            is Shape.DrawableShape -> {
                val mutatedState = shape.drawable.constantState?.newDrawable()?.mutate() ?: shape.drawable
                shape.copy(drawable = mutatedState)
            }
            else -> shape
        }
    }

    fun render(canvas: Canvas, deltaTime: Float) {
        if (enabled) emitter.createConfetti(deltaTime)

        for (i in particles.size - 1 downTo 0) {
            val particle = particles[i]
            particle.applyForce(gravity)
            particle.render(canvas, deltaTime)
        }
        particles.removeAll { it.isDead() }
    }

    fun getActiveParticles(): Int = particles.size

    fun isDoneEmitting(): Boolean =
        (emitter.isFinished() && particles.size == 0) || (!enabled && particles.size == 0)
}
