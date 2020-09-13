package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldDecreaseTemperatureUnderLimitUp() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(30);
        conditioner.DecreaseCurrentTemperature(conditioner.getCurrentTemperature());
        var expected = 29;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseTemperatureUnderLimitDown() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(16);
        conditioner.DecreaseCurrentTemperature(conditioner.getCurrentTemperature());
        var expected = 15;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

//    @Test
//    public void shouldDecreaseTemperatureAfterLimitUp() {
//        Conditioner conditioner = new Conditioner();
//        conditioner.setCurrentTemperature(33); // считаем, что начальное значение температуры выставляем кнопками на пульте
//        conditioner.DecreaseCurrentTemperature(conditioner.getCurrentTemperature());
//        var expected = 30;
//        assertEquals(expected, conditioner.getCurrentTemperature());
//    }

    @Test
    public void shouldDecreaseTemperatureAfterLimitDown() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(0);
        conditioner.DecreaseCurrentTemperature(conditioner.getCurrentTemperature());
        var expected = 15;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseTemperatureUnderLimitUp() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(29);
        conditioner.IncreaseCurrentTemperature(conditioner.getCurrentTemperature());
        var expected = 30;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseTemperatureUnderLimitDown() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(15);
        conditioner.IncreaseCurrentTemperature(conditioner.getCurrentTemperature());
        var expected = 16;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseTemperatureAfterLimitUp() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(30);
        conditioner.IncreaseCurrentTemperature(conditioner.getCurrentTemperature());
        var expected = 30;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}
