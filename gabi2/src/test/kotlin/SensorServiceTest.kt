import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("NonAsciiCharacters")
class SensorServiceTest {
    val sensorService = SensorService()

    @Test
    fun `공기질 좋음`() {
        val actual = sensorService.readAirQualityStatus(10)
        val expect = "공기질은 좋음 입니다"

        assertEquals(expect, actual)
    }

    @Test
    fun `공기질 나쁨`() {
        val actual = sensorService.readAirQualityStatus(300)
        val expect = "공기질은 나쁨 입니다"

        assertEquals(expect, actual)
    }

    @Test
    fun `습도 높음`() {
        val actual = sensorService.readHumidityStatus(20)
        val expect = "습도가 높습니다."

        assertEquals(expect, actual)
    }

    @Test
    fun `습도 정상`() {
        val actual = sensorService.readHumidityStatus(5)
        val expect = "습도가 정상입니다."

        assertEquals(expect, actual)
    }
}