import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.practice.*;

public class MainTest {
    @Test
    void testPrintNumbers() {
        String[] expected = {"i = 1", "i = 2", "i = 3", "i = 4", "i = 5"};
        String[] actual = Main.printNumbers(1, 5);

        assertArrayEquals(expected, actual);
    }

    @Test
    void testPrintNumbersSingleValue() {
        String[] expected = {"i = 10"};
        String[] actual = Main.printNumbers(10, 10);

        assertArrayEquals(expected, actual);
    }
}
