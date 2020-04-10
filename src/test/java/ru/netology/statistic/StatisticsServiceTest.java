package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        long[] incomesInBillions2 = {11, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected2 = 12;

        long actual2 = service.findMax(incomesInBillions2);

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
    }

}