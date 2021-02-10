package ru.netology.domain;

public class Radio {
    private int stationNumber;
    private int volume;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void volumeUp () {
        if (volume==10) {
            volume = 10;
        } else
            volume++;
    }

    public void volumeDown () {
        if (volume==0) {
            volume = 0;
        } else
            volume--;
    }

    public void stationUp () {
        if (stationNumber==9) {
            stationNumber = 0;
        } else
            stationNumber++;
    }

    public void stationDown () {
        if (stationNumber==0) {
            stationNumber = 9;
        } else
            stationNumber--;
    }
}


