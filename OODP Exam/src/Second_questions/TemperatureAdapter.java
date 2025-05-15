public class TemperatureAdapter implements TemperatureSensor {
    private FahrenheitSensor fahrenheitSensor;

    public TemperatureAdapter(FahrenheitSensor sensor) {
        this.fahrenheitSensor = sensor;
    }

    @Override
    public double getTemperatureInCelsius() {
        double f = fahrenheitSensor.measureFahrenheit();
        return (f - 32) * 5.0 / 9.0;
    }
}
