
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test002 {

    @BeforeAll
    static void setupAll() {
        System.out.println("@BeforeAll Executed once before all tests");
        // Example: Initialize configurations or test containers
    }

    @BeforeEach
    void setupEach() {
        System.out.println("@BeforeEach Executed before each test");
        // Example: Initialize objects or data specific to each test, connect to DB in test container
    }


    @AfterEach
    void tearDownEach() {
        System.out.println("@AfterEach Executed after each test");
        // Example: Clean up resources specific to each test
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("@AfterAll Executed once after all tests");
        // Example: Clean up shared resources
    }

    @Test
    void testOne() {
        System.out.println("Running test 1");
    }

    @Test
    void testTwo() {
        System.out.println("Running test 2");
    }

}
