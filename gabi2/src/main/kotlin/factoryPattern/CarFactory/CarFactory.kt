package factoryPattern.CarFactory

import factoryPattern.Car.Car

abstract class CarFactory {
    abstract fun createCar(type: String): Car?
}