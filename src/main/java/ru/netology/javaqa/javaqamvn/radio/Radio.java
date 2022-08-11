package ru.netology.javaqa.javaqamvn.radio;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentRadioStation = minStation; //задание станции
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume = minVolume; // задание громкости

    public int getCurrentRadioStation() { // запрос станции

        return currentRadioStation;
    }
    public int getMaxStation(){  //возвращение максимальной станции
        return maxStation;
    }
    public int getMinStation(){ //возвращение мин станции
        return minStation;
    }

    public int setCurrentRadioStation(int newStation) { //условие что станция в пределах
        if (newStation >= minStation && newStation <=maxStation) {
            currentRadioStation = newStation;

        }
        return currentRadioStation;
    }
    public int nextStation() { // переход на следующую станцию
        if (currentRadioStation < maxStation) {
            currentRadioStation = currentRadioStation +1;
        }
        else {
            currentRadioStation = minStation;
        }
        return currentRadioStation;
    }

    public int prevStation() { //переход на предыдущую станцию
        if (currentRadioStation > minStation) {
            currentRadioStation = currentRadioStation - 1;
        }
        else{
            currentRadioStation = maxStation;
        }
        return currentRadioStation;
    }

    public int getCurrentVolume() { // запрос громкости
        return currentVolume;
    }
    public int getMaxVolume (){ //возвращение макс громкости
        return maxVolume;
    }
    public int getMinVolume (){ //возвращение мин громкости
        return minVolume;
    }

    public void setCurrentVolume(int newVolume) { //условие что громкость в пределах
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;
    }
    //////   (изменить!!!!!!!)закоммитить и запушить
    public int nextVolume() { // увеличение громкости
        if (currentVolume < maxVolume){
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int prevVolume() {  // уменьшение громкости
        if (currentVolume > minVolume){
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

}

