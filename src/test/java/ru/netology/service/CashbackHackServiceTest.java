package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void bonusTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 1000;

        int actual = cashbackHackService.remain(boundary);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void bonusTestLess() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 800;

        int actual = cashbackHackService.remain(boundary);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void bonusTestLess1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 999;

        int actual = cashbackHackService.remain(boundary);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void bonusTestMore() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 1500;

        int actual = cashbackHackService.remain(boundary);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void bonusTestMore2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 2000;

        int actual = cashbackHackService.remain(boundary);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
