public class ConversaoTemperatura {

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
