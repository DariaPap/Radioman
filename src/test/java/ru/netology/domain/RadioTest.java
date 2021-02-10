package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldCheckParams1() {
        Radio radio = new Radio();

        int expectedStation = 1;
        int expectedVolume = 1;


        radio.setStationNumber(1);
        radio.setVolume(1);


        assertEquals(expectedStation, radio.getStationNumber());
        assertEquals(expectedVolume, radio.getVolume());

    }

    @Test
    public void shouldCheckParams2() {
        Radio radio = new Radio();

        int expectedStation = 9;
        int expectedVolume = 1;

        radio.setStationNumber(-1);
        radio.setVolume(0);

        assertEquals(expectedStation, radio.getStationNumber());
        assertEquals(expectedVolume, radio.getVolume());

    }

    @Test
    public void shouldCheckParams3() {
        Radio radio = new Radio();

        int expectedStation = 0;
        int expectedVolume = 10;

        radio.setStationNumber(10);
        radio.setVolume(11);

        assertEquals(expectedStation, radio.getStationNumber());
        assertEquals(expectedVolume, radio.getVolume());

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", lineSeparator = "/")
    void shouldCheckRadioButtons(String buttonValue, int stationNumber, int volume, int expectedStation,
                                 int expectedVolume) {
        Radio radio = new Radio();
        int[] value = radio.radioButtons(buttonValue, stationNumber, volume);
        int curStationNumber = Array.getInt(value, 0);
        int curVolume = Array.getInt(value, 1);

        assertEquals(expectedStation, curStationNumber);
        assertEquals(expectedVolume, curVolume);
    }
}