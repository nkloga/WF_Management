import ee.sda.EmployeeSort;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeSortTest {

    @Test
    public void EmployeeSort_test() {
        for (int i = 0; i < 10; i++) {
            Double result = EmployeeSort.getRandomHours(16);
            Boolean condition1 = result >= 1.0 && result <= 8.0;
            Boolean condition2 = result % 0.5 == 0;
            Assert.assertTrue(condition1);
            Assert.assertTrue(condition2);
        }
    }

    @Test(expected = BusinessException.class)
    public void EmployeeSort_test2() {
        for (int i = 0; i < 1000; i++) {
            Double result = EmployeeSort.getRandomHours(0);
        }
    }

    @Test
    public void EmployeeSort_test3() {
        Double result = EmployeeSort.getRandomHours(Integer.MAX_VALUE);
        Boolean condition1 = result >= 1.0 && result <= Integer.MAX_VALUE / 2;
        Boolean condition2 = result % 0.5 == 0;
        Assert.assertTrue(condition1);
        Assert.assertTrue(condition2);
    }
}