package com.github.pedrovgs.problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals

public class BitsCounterTest {

  private BitsCounter bitsCounter;

  @Before public void setUp() {
    bitsCounter = new BitsCounter();
  }

  @Test public void numberOfBitsInOneIsOne() {
    assertEquals(4, bitsCounter.countBitsToOneBasedOnString(10));
  }
  @Test public void numberOfBitsInOneIsOne() {
    assertEquals(2, bitsCounter.countBitsToOneBasedOnString(2));
  }
  @Test public void numberOfBitsInOneIsOne() {
    assertEquals(1, bitsCounter.countBitsToOneBasedOnString(0));
  }
  @Test public void numberOfBitsInOneIsOne() {
    assertEquals(5, bitsCounter.countBitsToOneBasedOnString(20));
  }
  
