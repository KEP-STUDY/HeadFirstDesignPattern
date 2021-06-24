package templateMethodPattern

abstract class Teacher {
    fun startClass() {
        enterClass()
        attendance()
        teach()
        outside()
    }

    // 공통 메서드
    private fun enterClass() {
        println("선생님이 강의실로 들어오심니당.")
    }

    private fun attendance() {
        println("선생님이 출석을 부르고 있어용.")
    }

    private fun outside() {
        println("수업 끗.")
    }

    // 추상 메서드
    abstract fun teach()
}