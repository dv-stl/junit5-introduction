import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Test001 {

    @Test
    @DisplayName("Check if world is greeted politely")
    void hello() {
        var hello = "Hello World";
        assertTrue(hello.toLowerCase().contains("hello"));
    }

}
