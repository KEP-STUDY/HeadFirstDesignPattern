package factoryPattern.CarFactory

import factoryPattern.Car.Car
import factoryPattern.Car.SUV
import factoryPattern.Car.Sedan

class HyundaiCarFactory : CarFactory() {
    override fun createCar(type: String): Car? {
        val car = when (type) {
            "SUV" -> SUV()
            "Sedan" -> Sedan()
            else -> null
        }
        return car
    }
}