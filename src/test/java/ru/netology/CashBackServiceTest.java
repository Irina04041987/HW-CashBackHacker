package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

class CashBackServiceTest {
    CashBackService cashBackService = new CashBackService();

    @Test
    public void shouldCheckRemain() {
        assertEquals(100,cashBackService.remain(900));
    }

    @Test
    public void shouldCheckRemainIfAmountEqualToBoundary() {
        assertEquals(0,cashBackService.remain(1000));

    }
    @Test
    public void shouldCheckRemainifAmountOverBoundary() {
        assertEquals(100,cashBackService.remain(1900));
    }
}