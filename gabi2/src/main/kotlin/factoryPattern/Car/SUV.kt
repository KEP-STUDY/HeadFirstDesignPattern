package factoryPattern.Car

class SUV : Car() {
    override fun getCarName(): String {
        return "이 차는 SUV 입니다."
    }
}