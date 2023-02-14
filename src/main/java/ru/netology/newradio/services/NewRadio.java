package ru.netology.newradio.services;

public class NewRadio {

    private int currentRadioStation;

    public void next() {
        if (currentRadioStation != 9) {
            currentRadioStation = currentRadioStation + 1;

        } else {

            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }


    private int currentRadioVolume;

    public void nextRadioVolume() {

        if (currentRadioVolume < 10) {

            currentRadioVolume = currentRadioVolume + 1;

        }
    }


        public void prevRadioVolume () {

            if (currentRadioVolume > 0) {

                currentRadioVolume = currentRadioVolume - 1;
            } else {
                currentRadioVolume = 0;
            }
        }


    public int getCurrentRadioVolume() {

        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {

        if (newCurrentRadioVolume > 10) {

            return;
        }

        if (newCurrentRadioVolume < 0) {

            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }
}













