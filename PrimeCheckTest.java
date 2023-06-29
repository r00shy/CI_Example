import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    boolean isPrime = true;
    for (int i = 2; i <= 1000; i++) {
      for (int j = 2; j*j <= i; j++) {
        if(i%j==0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        assertEquals("Number is prime", true, PrimeCheck.isPrime(i));
      }
      isPrime = true;
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    for (int i = 2; i <= 1000; i++) {
      for (int j = 2; j*j <= i; j++) {
        if(i%j==0) {
          assertEquals("Number is not prime", false, PrimeCheck.isPrime(i));
          break;
        }
      }
    }
  }
}
