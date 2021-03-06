package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashBackServiceTest {
    CashBackService cashBackService = new CashBackService();

    @Test
    public void shouldCheckRemain() {
        assertEquals(cashBackService.remain(900), 100);
    }

    @Test
    public void shouldCheckRemainIfAmountEqualToBoundary() {
        assertEquals(cashBackService.remain(1000), 0);

    }
    @Test
    public void shouldCheckRemainifAmountOverBoundary() {
        assertEquals(cashBackService.remain(1900), 100);
    }
}