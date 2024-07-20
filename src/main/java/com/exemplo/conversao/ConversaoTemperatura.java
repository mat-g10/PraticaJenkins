public class ConversaoTemperatura {

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 4.0 / 9.0; //fórmula alterada para introduzir erro lógico
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
