package ru.netology.radio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

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


