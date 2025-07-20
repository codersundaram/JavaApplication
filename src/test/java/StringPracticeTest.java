import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.practice.*;
public class StringPracticeTest {

    @Test
    void testGetNameReturnsSameValue() {
        String input = "Codersundaram";
        String result = StringPractice.getName(input);
        assertEquals("Codersundaram", result);
    }

    @Test
    void testGetNameWithEmptyString() {
        String input = "";
        String result = StringPractice.getName(input);
        assertEquals("", result);
    }

    @Test
    void testGetNameWithNull() {
        String input = null;
        String result = StringPractice.getName(input);
        assertNull(result);
    }

}
