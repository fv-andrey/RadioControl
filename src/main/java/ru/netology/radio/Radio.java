package ru.netology.radio;

public class Radio {
    private int maxStation;
    private int maxNumber;
    private int minNumber = 0;
    private int number = minNumber;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;

    Radio(int maxStation) {
        if (maxStation < minNumber) {
            return;
        }
        this.maxStation = maxStation;
        maxNumber = maxStation - 1;
    }

    Radio() {
        maxStation = 10;
        maxNumber = maxStation - 1;
    }

    int getMaxStation() {
        return maxStation;
    }

    int getMaxNumber() {
        return maxNumber;
    }

    int getNumber() {
        return number;
    }

    void nextNumber() {
        if (number + 1 > maxNumber) {
            number = minNumber;
        } else {
            number = number + 1;
        }
    }

    void prevNumber() {
        if (number - 1 < minNumber) {
            number = maxNumber;
        } else {
            number = number - 1;
        }
    }

    void setNumber(int chooseNumber) {
        if (chooseNumber < minNumber) {
            return;
        }
        if (chooseNumber > maxNumber) {
            return;
        }
        number = chooseNumber;
    }

    int getVolume() {
        return volume;
    }

    void setVolume(int newVolume) {
        volume = newVolume;
    }

    void upVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    void downVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }
}
