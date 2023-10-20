package com.dufuna.berlin.michaelmenebraye.tax;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.dufuna.berlin.michaelmenebraye.tax.service.TaxCalculatorImp;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaxCalculatorImpTest {
    TaxCalculatorImp calculator = new TaxCalculatorImp();
    @Test
    public void testForLowIncomeOne() {
        double result = calculator.getTaxOwed(10000);
        assertEquals(0.0, result, 0.001); // Assuming the expected value is 0.0
    }

    @Test
    public void testForLowIncomeTwo() {
        assertEquals(3571.81, calculator.getTaxOwed(20000), 0.01);
    }

    @Test
    public void testForLowIncomeThree() {
        assertEquals(20796.485, calculator.getTaxOwed(50000), 0.01);
    }

    @Test
    public void testForLowIncomeFour() {
        assertEquals(54096.119999999995, calculator.getTaxOwed(90001), 0.01);
    }
}
