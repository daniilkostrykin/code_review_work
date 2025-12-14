import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.dif(5, 3));
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.div(25, 5));
        assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.times(2, 3));
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        assertEquals(42, calculator.solver());
    }
}
