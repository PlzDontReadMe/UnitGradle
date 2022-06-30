package ru.netology.service;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldRemainOfMin(){
        CashbackHackService result = new CashbackHackService();

        int expected = 999;
        int actual = result.remain(1);

        assertEquals(expected,actual);
    }
    @Test
    public void shouldRemainOfMax(){
        CashbackHackService result = new CashbackHackService();

        int expected = 1;
        int actual = result.remain(999);

        assertEquals(expected,actual);
    }
    @Test
    public void shouldRemainOfFull(){
        CashbackHackService result = new CashbackHackService();

        int expected = 0;
        int actual = result.remain(1000);

        assertEquals(expected,actual);
    }

}