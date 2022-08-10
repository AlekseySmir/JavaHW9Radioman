package ru.netology.javaqa.javaqamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test  //задание станции
    public void shouldSetRadioStation(){
        Radio rad = new Radio ();
        rad.setCurrentRadioStation(5);
        int expected = 5;
        int actual = rad.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test // следующая станция в пределах
    public void currentStationPlusOne(){
        Radio rad = new Radio ();
        rad.setCurrentRadioStation(6);
        rad.nextStation();
        int expected = 7;
        int actual = rad.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test // следующая за максимальной
    public void stationNextMax(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test // предыдущая станция в пределах
    public void currentStationMinusOne(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(3);
        rad.prevStation();
        int expected = 2;
        int actual = rad.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test  //предыдущая от минимальной
    public void stationLessThenMin (){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prevStation();
        int expected = 9;
        int actual = rad.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test   // переход на максимальную станцию
    public void shouldSetToMaxStation(){
        Radio rad = new Radio();
        rad.setToMaxStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test  //станция не должна быть больше максимальной
    public void shouldNoSetRadioStationAboveMax(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}
