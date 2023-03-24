package ru.netology.radio;

public class Radio {
    private int number;
    private int volume;

    int getNumber() {
        return number;
    }

    void nextNumber() {
        if (number + 1 > 9) {
            number = 0;
        } else {
            number = number + 1;
        }
    }

    void prevNumber() {
        if (number - 1 < 0) {
            number = 9;
        } else {
            number = number - 1;
        }
    }

    void setNumber(int chooseNumber) {
        if (chooseNumber < 0) {
            return;
        }
        if (chooseNumber > 9) {
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
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    void downVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
