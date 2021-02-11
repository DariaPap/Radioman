package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldTestVolumeUp() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeUp();
        assertEquals(1, radio.getVolume());
    }

    @Test
    void shouldTestVolumeUpWhenVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.volumeUp();
        assertEquals(10, radio.getVolume());
    }

    @Test
    void shouldTestVolumeDown() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.volumeDown();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldTestVolumeDownWhenVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldTestStationUp() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.stationUp();
        assertEquals(1, radio.getStationNumber());
    }

    @Test
    void shouldTestStationUpWhenStationMax() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.stationUp();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    void shouldTestStationDown() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.stationDown();
        assertEquals(8, radio.getStationNumber());
    }

    @Test
    void shouldTestStationDownWhenStationMin() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.stationDown();
        assertEquals(9, radio.getStationNumber());
    }
}