package ru.netology.javaqa.javaqamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void nextStation() {
        Radio rad = new Radio(25);
        rad.setCurrentStation(23);
        rad.nextStation();
        int expected = 24;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationAfterMax() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(29);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prevStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationBeforeMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.nextVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeAfterMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.nextVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.prevVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeBeforeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.prevVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMoreThanMax() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(52);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationLessThanMin() {
        Radio rad = new Radio(15);
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMoreThanMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeLessThanMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

