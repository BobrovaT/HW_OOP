package ru.netology.javaqa;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;
    private int minStation;
    private int minVolume;

    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
        this.maxVolume = 100;
        this.minVolume = 0;
    }

    public Radio(int stationCount, int volumeLevel) {
        this.currentStation = stationCount - 1;
        this.currentVolume = volumeLevel;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
