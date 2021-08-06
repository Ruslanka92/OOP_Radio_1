package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setSoundVolume(2);

        radio.setSoundVolume(5);
        radio.increaseVolume();

        assertEquals(6, radio.getSoundVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setSoundVolume(2);

        radio.setSoundVolume(10);
        radio.increaseVolume();

        assertEquals(10, radio.getSoundVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setSoundVolume(2);

        radio.setSoundVolume(5);
        radio.decreaseVolume();

        assertEquals(4, radio.getSoundVolume());
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setSoundVolume(2);

        radio.setSoundVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void shouldSwitchToTheNextStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setSoundVolume(2);

        radio.setCurrentRadioStation(3);
        radio.nextStation();

        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToTheNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);
        radio.setSoundVolume(2);

        radio.setCurrentRadioStation(9);
        radio.nextStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToThePreviousStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setSoundVolume(2);

        radio.setCurrentRadioStation(3);
        radio.previousStation();

        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToThePreviousStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.setSoundVolume(2);

        radio.setCurrentRadioStation(0);
        radio.previousStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void correctWorkSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(20);


        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void correctWorkSetSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(20);


        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void correctWorkSetCurrentRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-10);


        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void correctWorkSetSoundVolum2e() {
        Radio radio = new Radio();
        radio.setSoundVolume(-10);


        assertEquals(0, radio.getSoundVolume());
    }
}
