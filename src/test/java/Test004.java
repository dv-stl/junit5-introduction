import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test004 {

    @Test
    @DisplayName("When first assertion fails then the test is stopped")
    @Disabled
    void thisIsAnnoying() {
        assertEquals(2, 4, "This is the message from the first filing assertion");
        assertEquals(2, 3, "This is the message from the second filing assertion, you cannot see it until fist problem is fixed");
    }

    @Test
    @DisplayName("All assertions are verified")
    @Disabled
    void thisIsLessAnnoying() {
        assertAll(
                () -> assertEquals(2, 4, "What messages should be here?"),
                () -> assertEquals(5, 121, "Of course the message that explain why test failed. Ex: 5! is 120"),
                () -> assertEquals(5, 121, "THIS MESSAGE IS DISPLAYED WHEN TEST FAILS"),
                () -> assertEquals(5, 5, "NOT WHEN IT PASSES")
        );
    }


}
