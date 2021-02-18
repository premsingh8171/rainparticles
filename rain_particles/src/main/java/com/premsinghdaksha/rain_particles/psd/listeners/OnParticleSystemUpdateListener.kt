package com.premsinghdaksha.rain_particles.psd.listeners

import com.premsinghdaksha.rain_particles.psd.ParticleSystem
import com.premsinghdaksha.rain_particles.psd.view.RainParticlesView

/**
 * Created by Prem singh daksha.
 */
interface OnParticleSystemUpdateListener {
    fun onParticleSystemStarted(view: RainParticlesView, system: ParticleSystem, activeSystems: Int)
    fun onParticleSystemEnded(view: RainParticlesView, system: ParticleSystem, activeSystems: Int)
}
