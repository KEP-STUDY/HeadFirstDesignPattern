class SensorServiceUtils {

    companion object {
        private val sensorReporterExecutor = SensorReporterExecutor()

        fun getStatusMessage(sensorReporter: SensorReporter): String {
            sensorReporterExecutor.setReporter(sensorReporter)
            return sensorReporterExecutor.execute() ?: ""
        }
    }
}

class SensorReporterExecutor(private var sensorReporter: SensorReporter? = null) {
    fun setReporter(sensorReporter: SensorReporter) {
        this.sensorReporter = sensorReporter
    }

    fun execute() = sensorReporter?.report()
}

interface SensorReporter {
    fun report(): String
}

class HumidityReporter(val status: Int) : SensorReporter {
    override fun report(): String {
        return if (status > 10) {
            "습도가 높습니다."

        } else {
            "습도가 정상입니다."
        }
    }
}

class AirQualityReporter(val CO2Level: Int) : SensorReporter {
    override fun report(): String {
        return if (CO2Level > 200) {
            "공기질은 나쁨 입니다"
        } else {
            "공기질은 좋음 입니다"
        }
    }
}