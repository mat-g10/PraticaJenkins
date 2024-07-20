package com.exemplo.conversao;
import com.exemplo.conversao.ConversaoTemperatura;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversaoTemperaturaTest {

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(0.0, ConversaoTemperatura.fahrenheitParaCelsius(32.0), 0.01);
        assertEquals(100.0, ConversaoTemperatura.fahrenheitParaCelsius(212.0), 0.01);
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(32.0, ConversaoTemperatura.celsiusParaFahrenheit(0.0), 0.01);
        assertEquals(212.0, ConversaoTemperatura.celsiusParaFahrenheit(100.0), 0.01);
    }
}
