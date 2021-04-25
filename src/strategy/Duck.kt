package strategy

import strategy.behavior.fly.FlyBehavior
import strategy.behavior.sound.SoundBehavior

class Duck(
    flyBehavior: FlyBehavior,
    soundBehavior: SoundBehavior
) : Bird(flyBehavior, soundBehavior)