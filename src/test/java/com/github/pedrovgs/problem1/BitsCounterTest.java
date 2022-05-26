ackage com.github.pedrovgs.problem1;

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