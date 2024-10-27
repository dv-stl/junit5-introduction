import dk.stldev.Factorializer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class Test005 {

    @Test
    @DisplayName("Can the factor of 666 be calculated under 40ms")
    @Timeout(value = 40, unit = TimeUnit.MILLISECONDS)
    void fast() {
        var factorializer = new Factorializer();
        factorializer.factorialize(666);
    }

    @Test
    @Timeout(value = 40, unit = TimeUnit.MICROSECONDS)
    @DisplayName("Can the factor of 666 be calculated under 40µs - micro")
    void faster() {
        var factorializer = new Factorializer();
        factorializer.factorialize(666);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
    @DisplayName("Can the factor of 666666 be calculated under 1s - in another thread")
    void fasterInAnotherThread() {
        var factorializer = new Factorializer();
        factorializer.factorialize(1_000_000);
    }
}
