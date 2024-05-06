package ch.hslu.demo.sw02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturTest {

    @Test
    void temperature_getDefaultCelsius_celsiusReturned() {
        Temperatur temperature = new Temperatur();

        double celsius = temperature.getCelsius();

        assertEquals(20, celsius);
    }

    @Test
    void temperature_setCelsius_celsiusSet() {
        Temperatur temperature = new Temperatur(0);
        String str;

        temperature.setCelsius(30);

        assertEquals(30, temperature.getCelsius());
    }

    @Test
    void temperature_calculateKelvin_correctResult() {
        Temperatur temperature = new Temperatur(30);

        double kelvin = temperature.calculateKelvin();

        assertEquals(303.15, kelvin);
    }

    @Test
    void temperature_calculateFahrenheit_correctResult() {
        Temperatur temperature = new Temperatur(30);

        double fahrenheit = temperature.calculateFahrenheit();

        assertEquals(85.99999856948853, fahrenheit);
    }

    @Test
    void temperature_changeUnits_correctResult() {
        Temperatur temperature = new Temperatur(30);

        temperature.addCelsius(-7);
        assertEquals(23, temperature.getCelsius());

        temperature.addKelvin(4);
        assertEquals(27, temperature.getCelsius());
        assertEquals(300.15, temperature.calculateKelvin());

        temperature.addFahrenheit(9);
        assertEquals(31.999999284744263, temperature.getCelsius());
        assertEquals(89.5999971866608, temperature.calculateFahrenheit());
    }

    @Test
    void setCelsius_temperatureTooHigh_exceptionThrown() {
        Temperatur temperature = Temperatur.createFromCelsius(0);

        var e = assertThrows(IllegalArgumentException.class, () -> temperature.setCelsius(3001));

        assertEquals("This temperature is not allowed", e.getMessage());
    }

    @Test
    void setCelsius_temperatureTooLow_exceptionThrown() {
        Temperatur temperature = Temperatur.createFromCelsius(0);

        var e = assertThrows(IllegalArgumentException.class, () -> temperature.setCelsius(-3001));

        assertEquals("This temperature is not allowed", e.getMessage());
    }

    @Test
    void identifyAggregateState_stickstoff_correctIdentified() {
        Temperatur temperature = new Temperatur();

        var aggregateState = temperature.identifyAggregateState(Temperatur.Element.STICKSTOFF, -210.1);

        assertEquals("melted", aggregateState);
    }

    @Test
    void identifyAggregateState_quecksilber_correctIdentified() {
        Temperatur temperature = new Temperatur();

        var aggregateState = temperature.identifyAggregateState(Temperatur.Element.QUECKSILBER, -38.82);

        assertEquals("solid", aggregateState);
    }

    @Test
    void identifyAggregateState_blei_correctIdentified() {
        Temperatur temperature = new Temperatur();

        var aggregateState = temperature.identifyAggregateState(Temperatur.Element.BLEI, 1744);

        assertEquals("boiled", aggregateState);
    }

}
