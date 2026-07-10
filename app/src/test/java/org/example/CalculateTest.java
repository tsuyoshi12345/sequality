package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();

    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testGetIndividualFeeChild() {
    Calculate calculate = new Calculate();

    assertEquals(1000, calculate.getIndividualFee(10));
  }

  @Test
  public void testGetIndividualFeeAdult() {
    Calculate calculate = new Calculate();

    assertEquals(2000, calculate.getIndividualFee(20));
  }

  @Test
  public void testGetTotalFeeNoDiscount() {
    Calculate calculate = new Calculate();

    assertEquals(10000, calculate.getTotalFee(20, 5));
  }

  @Test
  public void testGetTotalFeeDiscount() {
    Calculate calculate = new Calculate();

    assertEquals(18000, calculate.getTotalFee(25, 10));
  }
}
