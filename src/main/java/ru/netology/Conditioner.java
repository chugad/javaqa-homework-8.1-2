package ru.netology;

public class Conditioner {

    private int maxTemperature = 30;
    private int minTemperature = 15;
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
        if (currentTemperature >= maxTemperature) {
            return maxTemperature;
        }
        if (currentTemperature <= minTemperature) {
            return minTemperature;
        }
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void IncreaseCurrentTemperature(int CurrentTemperature) {
        if (currentTemperature < maxTemperature) {
            this.currentTemperature = currentTemperature + 1;
        }
    }
    public void DecreaseCurrentTemperature(int CurrentTemperature) {
        if (currentTemperature > minTemperature) {
            this.currentTemperature = currentTemperature - 1;
        }
    }
}
