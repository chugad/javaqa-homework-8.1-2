package ru.netology;

public class Conditioner {

    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
            this.currentTemperature = currentTemperature;
    }

    public void IncreaseCurrentTemperature() {
        if (currentTemperature < maxTemperature) {
            this.currentTemperature = currentTemperature + 1;
        } else {
            currentTemperature = maxTemperature;
        }
    }
    public void DecreaseCurrentTemperature() {
        if (currentTemperature > minTemperature) {
            this.currentTemperature = currentTemperature - 1;
        } else {
            currentTemperature = minTemperature;
        }
    }
}
