class SensorService {

    fun readAirQualityStatus(currentCO2Level: Int): String {
        return SensorServiceUtils.getStatusMessage(AirQualityReporter(currentCO2Level))
    }

    fun readHumidityStatus(currentStatus: Int): String {
        return SensorServiceUtils.getStatusMessage(HumidityReporter(currentStatus))
    }
}