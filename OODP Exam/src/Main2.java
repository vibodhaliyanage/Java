
public class Main2 {
    public static void main(String[] args) {
        TemperatureSensor celsius = new CelsiusSensor();
        System.out.println("Celsius reading: " + celsius.getTemperatureInCelsius());

        TemperatureSensor adapter = new TemperatureAdapter(new FahrenheitSensor());
        System.out.println("Fahrenheit converted to Celsius: " + adapter.getTemperatureInCelsius());
    }
}
