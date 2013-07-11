import org.junit.Before;
import org.junit.Test;
import tdd.kata.StringCalculator;

/**
 * User: Tu
 * Date: 7/11/13
 */
import static org.junit.Assert.*;
public class StringCalculatorTest
{
    private StringCalculator stringCalculator;

    @Before
    public void createInstance()  {
        stringCalculator = new StringCalculator();
    }
    @Test
    public void testWithBlankString() throws Exception
    {
        assertEquals(0,stringCalculator.add(""));

    }
}