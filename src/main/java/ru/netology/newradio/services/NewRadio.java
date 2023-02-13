package ru.netology.newradio.services;
public class NewRadio {

 public int currentRadioStation;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void Next(int newCurrentRadioStation) {

        if (newCurrentRadioStation == 9) {

            currentRadioStation = 0;
        }

        if (newCurrentRadioStation < 9) {

            currentRadioStation = newCurrentRadioStation + 1;

            if (newCurrentRadioStation >= 0) {

                currentRadioStation = newCurrentRadioStation + 1;
            }
        }

    }


    public void Prev(int newCurrentRadioStation) {

        if (newCurrentRadioStation == 0) {

            currentRadioStation = 9;
        }

        if (newCurrentRadioStation > 0) {

            currentRadioStation = newCurrentRadioStation - 1;

            if (newCurrentRadioStation <= 9) {

                currentRadioStation = newCurrentRadioStation - 1;
            }
        }
    }


    public int currentRadioVolume;

    public int getCurrentRadioVolume() {

        return currentRadioVolume;
    }

    public void maxRadioVolume(int newMaxRadioVolume) {

        if (newMaxRadioVolume == 10) {

            currentRadioVolume = newMaxRadioVolume + 1;
            currentRadioVolume = 10;
        }

        if (newMaxRadioVolume < 10) {

            currentRadioVolume = newMaxRadioVolume + 1;

            if (newMaxRadioVolume > 0) {

                currentRadioVolume = newMaxRadioVolume + 1;
            }
        }
    }


    public void minRadioVolume(int newMinRadioVolume) {

        if (newMinRadioVolume == 0) {
            currentRadioVolume = newMinRadioVolume - 1;
            currentRadioVolume = 0;
        }

        if (newMinRadioVolume > 0) {

            currentRadioVolume = newMinRadioVolume - 1;

            if (newMinRadioVolume <= 10) {
                currentRadioVolume = newMinRadioVolume - 1;
            }
        }
    }

}







