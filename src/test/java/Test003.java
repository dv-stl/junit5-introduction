import dk.stldev.Factorializer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test003 {

    @Test
    @DisplayName("Factoring numbers smaller than 1 ends with exception")
    void exceptionExpected() {
        var factorialazer = new Factorializer();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            factorialazer.factorialize(0);
        });
        assertEquals("Factorials can only be calculated for number > 1", ex.getMessage());
    }

    @Test
    @DisplayName("Factoring numbers bigger than 1 works without exception")
    void exceptionUnexpected() {
        var factorialazer = new Factorializer();
        assertDoesNotThrow(() -> {
            factorialazer.factorialize(1);
        });
    }

}
