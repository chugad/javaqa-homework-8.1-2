package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldDecreaseTemperatureUnderLimitUp() {
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.decreaseCurrentTemperature();
        var expected = 29;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseTemperatureUnderLimitDown() {
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        var expected = 15;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseTemperatureAfterLimitDown() {
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(0);
        conditioner.decreaseCurrentTemperature();
        var expected = 15;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseTemperatureUnderLimitUp() {
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(29);
        conditioner.increaseCurrentTemperature();
        var expected = 30;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseTemperatureUnderLimitDown() {
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(15);
        conditioner.increaseCurrentTemperature();
        var expected = 16;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseTemperatureAfterLimitUp() {
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(3333);
        conditioner.increaseCurrentTemperature();
        var expected = 1;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}
