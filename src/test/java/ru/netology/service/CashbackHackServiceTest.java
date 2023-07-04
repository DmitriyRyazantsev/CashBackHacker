package ru.netology.service;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    @org.junit.Test
    public void bonusTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 1000;

        int actual = cashbackHackService.remain(boundary);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void bonusTestLess() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 999;

        int actual = cashbackHackService.remain(boundary);
        int expected = 1;

        assertEquals(actual, expected);
    }
}