package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/currentStationTest")
    public void currentStationTest(int expected, int currentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStationTest")
    public void nextStationTest(int expected, int currentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);

        radio.nextStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStationTest")
    public void prevStationTest(int expected, int currentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);

        radio.prevStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/reduceVolumeTest")
    public void reduceVolumeTest(int expected, int currentVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolumeTest")
    public void increaseVolumeTest(int expected, int currentVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/currentVolumeTest")
    public void currentVolumeTest(int expected, int currentVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
}