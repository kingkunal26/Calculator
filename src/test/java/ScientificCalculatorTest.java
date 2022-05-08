import org.junit.Assert;
import org.junit.Test;

public class ScientificCalculatorTest {

    private ScientificCalculator scientificCalculator = new ScientificCalculator();
    private static final double DELTA = 1e-15;

    @Test
    public void testsquareRootValid() {
        Assert.assertEquals("Square root of positive integer", 4.0, scientificCalculator.squareRoot(16), DELTA);
        Assert.assertEquals("Square root of positive integer",3.0, scientificCalculator.squareRoot(9), DELTA);
    }

    @Test
    public void testfactorialValid() {
        Assert.assertEquals(6, scientificCalculator.factorial(3));
        Assert.assertEquals(720, scientificCalculator.factorial(6));
    }

    @Test
    public void testlogarithmValid() {
        Assert.assertEquals(1.3862943611198906, scientificCalculator.logarithm(4), DELTA);
        Assert.assertEquals(1.6094379124341003, scientificCalculator.logarithm(5), DELTA);
    }

    @Test
    public void testpowerValid() {
        Assert.assertEquals(8.0, scientificCalculator.power(2, 3), DELTA);
        Assert.assertEquals(125.0, scientificCalculator.power(5, 3), DELTA);
    }

    @Test
    public void testsquareRootInValid() {
        Assert.assertNotEquals(3.0, scientificCalculator.squareRoot(4), DELTA);
        Assert.assertNotEquals(4, scientificCalculator.squareRoot(10), DELTA);
    }

    @Test
    public void testfactorialInValid() {
        Assert.assertNotEquals(4, scientificCalculator.factorial(2));
        Assert.assertNotEquals(12, scientificCalculator.factorial(5));
    }

    @Test
    public void testlogarithmInValid() {
        Assert.assertNotEquals(3.0, scientificCalculator.logarithm(5), DELTA);
        Assert.assertNotEquals(0.0, scientificCalculator.logarithm(11), DELTA);
    }

    @Test
    public void testpowerInValid() {
        Assert.assertNotEquals(6.0, scientificCalculator.power(4, 4), DELTA);
        Assert.assertNotEquals(10.0, scientificCalculator.power(5, 3), DELTA);
    }
}
