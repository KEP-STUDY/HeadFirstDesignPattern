package strategy

import strategy.behavior.fly.FlyBehavior
import strategy.behavior.sound.SoundBehavior

abstract class Bird(
    private var flyBehavior: FlyBehavior,
    private var soundBehavior: SoundBehavior
) {
    fun replaceFly(flyBehavior: FlyBehavior) {
        this.flyBehavior = flyBehavior
    }

    fun replaceSound(soundBehavior: SoundBehavior) {
        this.soundBehavior = soundBehavior
    }

    fun doBehavior() {
        flyBehavior.fly()
        soundBehavior.sound()
    }
}