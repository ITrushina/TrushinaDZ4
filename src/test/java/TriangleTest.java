import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    @DisplayName("Позитивный тест")
    public void positiveTest() throws NotATriangleException, NegativeException {
        logger.info("Логи");
        assertEquals(12.0,TriangleArea.Area(5, 5, 6), "Не соответствует ожидаемому результату");
    }

    @Test
    @DisplayName("Ноль")
    public void zeroTest() {
        logger.info("Логи");
        Assertions.assertThrows(NegativeException.class, ()-> TriangleArea.Area(0, 5, 6), "нет исключения");
    }

    @Test
    @DisplayName("Отрицательное число")
    public void negativeNumbersTest() {
        logger.info("Логи");
        Assertions.assertThrows(NegativeException.class, ()-> TriangleArea.Area(4, -5, 6), "нет исключения");
    }

    @Test
    @DisplayName("Не треугольник")
    public void notTriangleTest() {
        logger.info("Логи");
        Assertions.assertThrows(NotATriangleException.class, ()-> TriangleArea.Area(1, 1, 6), "нет исключения");
    }
}
