package ru.netology.javaqa.javaqamvn.radio;

public class Radio {
    public int maxRadioStation = 9;
    public int minRadioStation = 0;

    public int currentRadioStation; //задание станции
    public int getCurrentRadioStation(){ // запрос станции
        return currentRadioStation;
    }
    public void setCurrentRadioStation (int newStation) { //условие что станция в пределах
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        currentRadioStation = newStation;
    }
    public void nextStation(){ // переход на следующую станцию
        if (currentRadioStation >= maxRadioStation){
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }
    public void prevStation(){ //переход на предыдущую станцию
        if (currentRadioStation <=minRadioStation){
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }
    public void setToMaxStation() { //задание максимальной станции
        currentRadioStation = 9;
    }

}
