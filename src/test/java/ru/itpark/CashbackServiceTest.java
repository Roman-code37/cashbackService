package ru.itpark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackServiceTest {

    @Test
    @DisplayName("Should calculate cashback")
    void calculateCashback() {
        var service = new CashbackService();
        var result = service.calculateCashback(100);

        assertEquals(5, result);
    }
}