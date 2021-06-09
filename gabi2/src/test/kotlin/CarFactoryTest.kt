import factoryPattern.CarFactory.BenzCarFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("NonAsciiCharacters")
class CarFactoryTest {
    val benzFactory = BenzCarFactory()
    val hyundaiFactory = factoryPattern.CarFactory.HyundaiCarFactory()

    @Test
    fun `벤츠 SUV`() {
        val car = benzFactory.createCar("SUV")
        val actual = car!!.getCarName()
        val expect = "이 차는 SUV 입니다."

        assertEquals(expect, actual)

    }

    @Test
    fun `벤츠 세단`() {
        val car = benzFactory.createCar("Sedan")
        val actual = car!!.getCarName()
        val expect = "이 차는 세단 입니다."

        assertEquals(expect, actual)

    }

    @Test
    fun `현대 SUV`() {
        val car = hyundaiFactory.createCar("SUV")
        val actual = car!!.getCarName()
        val expect = "이 차는 SUV 입니다."

        assertEquals(expect, actual)

    }

    @Test
    fun `현대 세단`() {
        val car = benzFactory.createCar("Sedan")
        val actual = car!!.getCarName()
        val expect = "이 차는 세단 입니다."

        assertEquals(expect, actual)
    }
}