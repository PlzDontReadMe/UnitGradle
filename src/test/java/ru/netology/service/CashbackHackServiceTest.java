package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {


    @Test
    public void shouldRemainOfMin(){
        CashbackHackService result = new CashbackHackService();

        int expected = 999;
        int actual = result.remain(1);

        assertEquals(actual,expected);
    }
    @Test
    public void shouldRemainOfMax(){
        CashbackHackService result = new CashbackHackService();

        int expected = 1;
        int actual = result.remain(999);

        assertEquals(actual,expected);
    }
    @Test
    public void shouldRemainOfFull(){
        CashbackHackService result = new CashbackHackService();

        int expected = 0;
        int actual = result.remain(1000);

        assertEquals(actual,expected);
    }

}