import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.newradio.services.NewRadio;

public class NewRadioTest {

    @Test
    public void maxRadioStation() {
        NewRadio radio = new NewRadio();

        radio.Next(9);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        NewRadio radio = new NewRadio();
        radio.Next(4);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void afterRadioStation() {
        NewRadio radio = new NewRadio();
        radio.Next(7);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusRadioStation() {
        NewRadio radio = new NewRadio();
        radio.Next(0);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void lastRadioStation() {
        NewRadio radio = new NewRadio();
        radio.Prev(0);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousRadioStation() {
        NewRadio radio = new NewRadio();
        radio.Prev(5);
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beforeRadioStation() {
        NewRadio radio = new NewRadio();
        radio.Prev(7);
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Next() {
        NewRadio radio = new NewRadio();

        radio.currentRadioStation = 10;
        int expected = 10;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        NewRadio radio = new NewRadio();

        radio.maxRadioVolume(10);

        int expected = 10;

        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void altVolume() {
        NewRadio radio = new NewRadio();
        radio.maxRadioVolume(6);
        int expected = 7;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void backVolume() {
        NewRadio radio = new NewRadio();

        radio.minRadioVolume(1);
        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        NewRadio radio = new NewRadio();
        radio.minRadioVolume(0);
        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beforeVolume() {
        NewRadio radio = new NewRadio();
        radio.minRadioVolume(10);
        int expected = 9;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
}
