package ru.netology.stats;

public class StatisticsService {
  public int calculateSum(int[] sales) {
    int sum = 0;
    for (int sale : sales) {
      sum += sale;
    }
    return sum;
  }

  public int calculateMiddleSum(int[] sales, int sum) {
    int middle = 0;
    for (int sale : sales) {
      middle = sum / sales.length;
    }
    return middle;
  }

  public int findMax(int[] sales) {
    int maxMonth = 0;
    int month = 0;
    for (int sale : sales) {
      if (sale >= sales[maxMonth]) {
        maxMonth = month;
      }
      month = month + 1;
    }
    return maxMonth + 1;
  }

  public int findMin(int[] sales) {
    int minMonth = 0;
    int month = 0;
    for (int sale : sales) {
      if (sale <= sales[minMonth]) {
        minMonth = month;
      }
      month = month + 1;
    }
    return minMonth + 1;
  }

  public int sumMonthsUnderMiddle(int[] sales, int middle) {
    int underMiddleMonths = 0;
    for (int sale : sales) {
      if (middle > sale)
        underMiddleMonths++;
    }
    return underMiddleMonths;
  }

  public int sumMonthsUpMiddle(int[] sales, int middle) {
    int upMiddleMonths = 0;
    for (int sale : sales) {
      if (middle < sale)
        upMiddleMonths++;
    }
    return upMiddleMonths;
  }
}