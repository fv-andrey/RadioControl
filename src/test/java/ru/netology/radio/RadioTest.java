package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void maxStationChooseTest() {
        Radio control = new Radio(1);

        Assertions.assertEquals(1, control.getMaxStation());
    }

    @Test
    void maxStationIfChooseBelowMinNumberTest() {
        Radio control = new Radio(-1);

        Assertions.assertEquals(0, control.getMaxStation());
    }

    @Test
    void maxStationDefaultTest() {
        Radio control = new Radio();

        Assertions.assertEquals(10, control.getMaxStation());
    }

    @Test
    void maxNumberWithChooseMaxStationTest() {
        Radio control = new Radio(25);

        Assertions.assertEquals(24, control.getMaxNumber());
    }

    @Test
    void maxNumberByDefaultMaxStationTest() {
        Radio control = new Radio();

        Assertions.assertEquals(9, control.getMaxNumber());
    }

    @Test
    void nextNumberTest() {
        Radio control = new Radio();
        control.setNumber(8);
        control.nextNumber();

        int expected = 9;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextNumberAfterMaxByDefaultMaxStationTest() {
        Radio control = new Radio();
        control.setNumber(9);
        control.nextNumber();

        int expected = 0;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextNumberAfterMaxWithChooseMaxStationTest() {
        Radio control = new Radio(25);
        control.setNumber(24);
        control.nextNumber();

        int expected = 0;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevNumberTest() {
        Radio control = new Radio();
        control.setNumber(1);
        control.prevNumber();

        int expected = 0;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevNumberAfterMinTest() {
        Radio control = new Radio();
        control.setNumber(0);
        control.prevNumber();

        int expected = 9;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevNumberAfterMinWithChooseMaxStationTest() {
        Radio control = new Radio(25);
        control.setNumber(0);
        control.prevNumber();

        int expected = 24;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevNumberAfterMinTest11() {
        Radio control = new Radio(25);
        control.setNumber(0);
        control.prevNumber();

        int expected = 24;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNumberTest() {
        Radio control = new Radio();
        control.setNumber(1);

        int expected = 1;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMinNumberTest() {
        Radio control = new Radio();
        control.setNumber(0);

        int expected = 0;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNumberBelowMinTest() {
        Radio control = new Radio();
        control.setNumber(-1);

        int expected = 0;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNumberBelowMaxTest() {
        Radio control = new Radio();
        control.setNumber(8);

        int expected = 8;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMaxNumberByDefaultMaxStationTest() {
        Radio control = new Radio();
        control.setNumber(9);

        int expected = 9;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMaxNumberWithChooseMaxStationTest() {
        Radio control = new Radio(25);
        control.setNumber(24);

        int expected = 24;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNumberAboveMaxByDefaultMaxStationTest() {
        Radio control = new Radio();
        control.setNumber(10);

        int expected = 0;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNumberAboveMaxWithChooseMaxStationTest() {
        Radio control = new Radio(25);
        control.setNumber(25);

        int expected = 0;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void upVolumeTest() {
        Radio control = new Radio();
        control.setVolume(99);
        control.upVolume();

        int expected = 100;
        int actual = control.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void upAfterSetMaxVolumeTest() {
        Radio control = new Radio();
        control.setVolume(100);
        control.upVolume();

        int expected = 100;
        int actual = control.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void downVolumeTest() {
        Radio control = new Radio();
        control.setVolume(1);
        control.downVolume();

        int expected = 0;
        int actual = control.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void downAfterSetMinVolumeTest() {
        Radio control = new Radio();
        control.setVolume(0);
        control.downVolume();

        int expected = 0;
        int actual = control.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
