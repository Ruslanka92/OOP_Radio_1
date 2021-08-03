package netology;

public class Radio {
    private int currentRadioStation;
    private int minimalNumberOfRadioStation = 0;
    private int maximalNumberOfRadioStation = 9;
    private int soundVolume;
    private int minimalSoundVolume =0;
    private int maximalSoundVolume =10;


    public void setCurrentRadioStation (int currentRadioStation) {
        if (currentRadioStation < minimalNumberOfRadioStation) {
            return;
        }
        if (currentRadioStation > maximalNumberOfRadioStation) {
            return;
        }

        this.currentRadioStation = currentRadioStation;
        }

    public int getCurrentRadioStation(){
        return currentRadioStation;
        }

    public void setSoundVolume (int soundVolume) {
        if (soundVolume < minimalSoundVolume) {
            return;
        }
        if (soundVolume > maximalSoundVolume) {
            return;
        }

        this.soundVolume = soundVolume;
    }

    public int getSoundVolume(){
        return soundVolume;
        }

    public void increaseVolume() {
        if (soundVolume < maximalSoundVolume) {
            soundVolume = soundVolume + 1;
        }
    }

        public void decreaseVolume() {
            if (soundVolume > minimalSoundVolume) {
                soundVolume = soundVolume - 1;
            }
        }

    public void nextStation() {
        if (currentRadioStation < maximalNumberOfRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation= minimalNumberOfRadioStation;
        }
    }

    public void previousStation() {
        if (currentRadioStation > minimalNumberOfRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        }else {
            currentRadioStation = maximalNumberOfRadioStation;
        }
    }
}