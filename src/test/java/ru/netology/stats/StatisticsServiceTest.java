package ru.netology.stats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatisticsService service = new StatisticsService();

    @Test
    void shouldReturnCalculateSum() {
        assertEquals(180, service.calculateSum(sales));
    }

    @Test
    void shouldReturnMiddleSum() {
        assertEquals(15, service.calculateMiddleSum(sales));
    }

    @Test
    void shouldReturnMaxMonth() {
        assertEquals(6, service.findMax(sales));
        assertEquals(8, service.findMaxSec(sales));
    }

    @Test
    void shouldReturnMinMonth() {
        assertEquals(9, service.findMin(sales));
    }


    @Test
    void shouldReturnMonthsUnderMiddle() {
        assertEquals(5, service.sumMonthsUnderMiddle(sales));
    }

    @Test
    void shouldReturnMonthsUpMiddle() {
        assertEquals(5, service.sumMonthsUpMiddle(sales));
    }
}