package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperatureon5() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(21);
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureAboveMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void notIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(22);
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(22, conditioner.getCurrentTemperature());
    }

    @Test
    public void leavesMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureOn5() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(22);
        conditioner.decreaseCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(17, conditioner.getCurrentTemperature());
    }

    @Test
    public void notDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(23);
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(23, conditioner.getCurrentTemperature());
    }

    @Test
    public void leavesMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(0);
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void leavesMinTemperature2() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(-1);
        conditioner.decreaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(0, conditioner.getCurrentTemperature());
    }

}