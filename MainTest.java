import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest {
    @Test
    public void testIsPrimeTrue() {
        // Arrange

        // Act
        boolean output = Main.isPrime(11);

        // Assert
        assertTrue(output);
    }
    @Test
    public void testisPrimeFalse() 
    {
        // Arrange

        // Act
        boolean output = Main.isPrime(4);
        // Assert
        assertFalse(output);
    }
    @Test
    public void testisPrimeNum1() 
    {
        // Arrange

        // Act
        boolean output = Main.isPrime(1);
        // Assert
        assertFalse(output);
    }
    @Test
    public void testisPrimeNegative() 
    {
        // Arrange

        // Act
        boolean output = Main.isPrime(-5);
        // Assert
        assertFalse(output);
    }
    @Test
    public void testisPrimeLarge() 
    {
        // Arrange

        // Act
        boolean output = Main.isPrime(103);
        // Assert
        assertTrue(output);
    }

    @Test(expected=NullPointerException.class)
    public void nullPointerSpecial2023() throws Exception
    {
        Main.special(2023);
    } 
    
}
