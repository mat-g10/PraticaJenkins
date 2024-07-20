package com.exemplo.conversao;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversaoTemperaturaTest {

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(0.0, ConversaoTemperatura.fahrenheitParaCelsius(32.0), 0.01);
        assertEquals(100.0, ConversaoTemperatura.fahrenheitParaCelsius(212.0), 0.01);
    }

    @Test
    public void testFahrenheitParaCelsius() {
        double resultado = ConversaoTemperatura.fahrenheitParaCelsius(32);
        // Valor esperado alterado para gerar falha
        assertEquals(0, resultado, 0.01);
    }

}
