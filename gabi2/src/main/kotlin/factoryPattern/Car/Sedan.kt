package factoryPattern.Car

class Sedan : Car() {
    override fun getCarName(): String {
        return "이 차는 세단 입니다."
    }
}