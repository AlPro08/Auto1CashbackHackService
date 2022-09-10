package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateAmountLoverBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmountHigherBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}