package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

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
    void nextNumberAfterMaxTest() {
        Radio control = new Radio();
        control.setNumber(9);
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
    void setMaxNumberTest() {
        Radio control = new Radio();
        control.setNumber(9);

        int expected = 9;
        int actual = control.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNumberAboveMaxTest() {
        Radio control = new Radio();
        control.setNumber(10);

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
