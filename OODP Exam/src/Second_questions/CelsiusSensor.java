public class CelsiusSensor implements TemperatureSensor {
    public double measureCelsius() {
        return 25.0;
    }

    @Override
    public double getTemperatureInCelsius() {
        return measureCelsius();
    }
}
