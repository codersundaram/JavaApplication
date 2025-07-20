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

    @Test
    void testGetReverseName_basic() {
        assertEquals("nhoJ", StringPractice.getReverseName("John"));
    }

    @Test
    void testGetReverseName_singleCharacter() {
        assertEquals("A", StringPractice.getReverseName("A"));
    }

    @Test
    void testGetReverseName_emptyString() {
        assertEquals("", StringPractice.getReverseName(""));
    }

    @Test
    void testGetReverseName_palindrome() {
        assertEquals("madam", StringPractice.getReverseName("madam"));
    }

    @Test
    void testGetReverseName_withSpaces() {
        assertEquals("dlroW olleH", StringPractice.getReverseName("Hello World"));
    }

}
