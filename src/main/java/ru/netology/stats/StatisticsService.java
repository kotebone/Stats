package ru.netology.stats;

public class StatisticsService {
  public int calculateSum(int[] sales) {
    int sum = 0;
    for (int sale : sales) {
      sum += sale;
    }
    return sum;
  }

  public int calculateMiddleSum(int[] sales) {
    return calculateSum (sales) / sales.length;
  }

  public int findMax(int[] sales) {
    int max = getMax(sales);
    int monthMax = 0;
    int resultMonth = 0;
    for (int sale : sales) {
      monthMax++;
      if (sale == max) {
        return monthMax;
      }
    }
    return resultMonth;
  }


  public int findMaxSec(int[] sales) {
    int max = getMax(sales);
    int monthMax = 0;
    int resultMonth = 0;
    for (int sale : sales) {
      monthMax++;
      if (sale == max) {
        resultMonth = monthMax;

      }
    }
    return resultMonth;
  }

  public int findMin(int[] sales) {
    int min = getMin(sales);
    int monthMin = 0;
    int resultMonth = 0;
    for (int sale : sales) {
      monthMin++;
      if (sale == min) {
        resultMonth = monthMin;
      }
    }
    return resultMonth;
  }

  public int sumMonthsUnderMiddle(int[] sales) {
    int middleSum = calculateMiddleSum(sales);
    int monthUnder = 0;
    for (int sale : sales) {
      if (middleSum < sale) {
        monthUnder++;
      }
    }
    return monthUnder;
  }
  public int sumMonthsUpMiddle(int[] sales) {
    int middleSum = calculateMiddleSum(sales);
    int monthUp = 0;
    for (int sale : sales) {
      if (middleSum > sale) {
        monthUp++;
      }
    }
    return monthUp;
  }

  private int getMin(int[] sales) {
    int min = sales[0];
    for (int sale : sales) {
      if (sale < min) {
        min = sale;
      }
    }
    return min;
  }

  private int getMax(int[] sales) {
    int max = sales[0];
    for (int sale : sales) {
      if (sale > max) {
        max = sale;
      }
    }
    return max;
  }
}