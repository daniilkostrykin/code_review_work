import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.dif(5, 3));
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(6, 3));
        assertThrows(IllegalArgumentException.class, () -> calculator.div(5, 0));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.times(2, 3));
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        assertEquals(16, calculator.solver());
    }
}