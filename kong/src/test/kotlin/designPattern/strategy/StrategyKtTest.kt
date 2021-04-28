package designPattern.strategy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StrategyKtTest {
    @Test
    fun `청둥 오리는 Quack 소리 낼수 있고 날수도 있습니다`() {
        class MallardDuck : Duck(FlyWithWings(), Quack()) {
            override fun display(): String {
                val message = "MallardDuck"
                println(message)
                return message
            }
        }

        val mallardDuck = MallardDuck()

        assertThat(mallardDuck.display()).isEqualTo("MallardDuck")
        assertThat(mallardDuck.performFly()).isEqualTo("FLY")
        assertThat(mallardDuck.performQuack()).isEqualTo("Quack")
    }

    @Test
    fun `고무 오리는 Squack 소리를 내고 날수도 없습니다`() {
        class RubberDuck : Duck(FlyNoWay(), Squack()) {
            override fun display(): String {
                val message = "RubberDuck"
                println(message)
                return message
            }
        }

        val rubberDuck = RubberDuck()

        assertThat(rubberDuck.display()).isEqualTo("RubberDuck")
        assertThat(rubberDuck.performFly()).isEqualTo("CAN'T FLY")
        assertThat(rubberDuck.performQuack()).isEqualTo("Squack")
    }

    @Test
    fun `붉은 머리 오리는 Quack 소리 낼수 있고 날수도 있습니다`() {
        class RedHeadDuck : Duck(FlyWithWings(), Quack()) {
            override fun display(): String {
                val message = "RedHeadDuck"
                println(message)
                return message
            }
        }

        val mallardDuck = RedHeadDuck()

        assertThat(mallardDuck.display()).isEqualTo("RedHeadDuck")
        assertThat(mallardDuck.performFly()).isEqualTo("FLY")
        assertThat(mallardDuck.performQuack()).isEqualTo("Quack")
    }

    @Test
    fun `가짜 오리는 소리 낼수 없고 날수도 없습니다`() {
        class DecoyDuck : Duck(FlyNoWay(), MuteQuack()) {
            override fun display(): String {
                val message = "DecoyDuck"
                println(message)
                return message
            }
        }

        val mallardDuck = DecoyDuck()

        assertThat(mallardDuck.display()).isEqualTo("DecoyDuck")
        assertThat(mallardDuck.performFly()).isEqualTo("CAN'T FLY")
        assertThat(mallardDuck.performQuack()).isEqualTo("")
    }
}