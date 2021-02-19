
# RainParticles Animation

<img src="https://github.com/premsingh8171/rainparticles/blob/master/app/src/main/res/drawable/animation.gif" width="300" height="550" />

## Installation

-  Add the following to your project level `build.gradle`:
 
```gradle
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```
  -  Add this to your app `build.gradle`:
 
```gradle
dependencies {
      
	       	     implementation 'com.github.premsingh8171:rainparticles:1.0.1'

}
```

## Using onClick

```xml

    <com.premsinghdaksha.rain_particles.psd.view.RainParticlesView
        android:id="@+id/rainparticlesview"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    </com.premsinghdaksha.rain_particles.psd.view.RainParticlesView>

```
```kotlin
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
            .addShapes(Shape.Mrectangle)
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
            .addShapes(Shape.Mrectangle)
            .addSizes(Size(12))
            .setPosition(-50f, rainparticlesview.width + 50f, -50f, -50f)
            .streamFor(300, 5000L)
    }
```




<h2>Created and maintained by:</h2>
<p>Er.Prem singh daksha  premsingh8171@gmail.com</p>
<p><a href="https://www.linkedin.com/in/prem-singh-daksha-82az/"> <img src="https://github.com/anitaa1990/DeviceInfo-Sample/blob/master/media/linkedin-icon.png" alt="Linkedin" style="max-width:100%;"> </a></p>
