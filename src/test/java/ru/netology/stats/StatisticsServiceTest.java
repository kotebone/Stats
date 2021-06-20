package ru.netology.stats;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {
    @org.junit.jupiter.api.Test
    void calculateSum() {
        ru.netology.stats.StatisticsService service = new ru.netology.stats.StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void testCalculateMiddleSum() {
        ru.netology.stats.StatisticsService service = new ru.netology.stats.StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.calculateSum(sales);
        int expected = 15;
        int actual = service.calculateMiddleSum(sales, sum);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void findMax() {
        ru.netology.stats.StatisticsService service = new ru.netology.stats.StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMax(sales);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void findMin() {
        ru.netology.stats.StatisticsService service = new ru.netology.stats.StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMin(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumMonthsUnderMiddle() {
        ru.netology.stats.StatisticsService service = new ru.netology.stats.StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.calculateSum(sales);
        int middle = service.calculateMiddleSum(sales, sum);
        int expected = 5;
        int actual = service.sumMonthsUnderMiddle(sales, middle);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumMonthsUpMiddle() {
        ru.netology.stats.StatisticsService service = new ru.netology.stats.StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.calculateSum(sales);
        int middle = service.calculateMiddleSum(sales, sum);
        int expected = 5;
        int actual = service.sumMonthsUpMiddle(sales, middle);
        assertEquals(expected, actual);
    }
}
