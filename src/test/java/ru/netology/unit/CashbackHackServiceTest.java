package ru.netology.unit;

import junit.framework.TestCase;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateRemain100() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected); //Remained 1000 but should 0
    }

    @Test
    public void shouldRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

}