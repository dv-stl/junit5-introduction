//import dk.stldev.Factorializer;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;
//
//import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//public class Test007 {
//
//    @DisplayName("@ValueSource")
//    @ParameterizedTest(name = "Test: {index} - factorialize({arguments})")
//    @ValueSource(ints = {1, 2})
//    void testIt(int num) {
//        var factorialazer = new Factorializer();
//        assertDoesNotThrow(() ->
//                factorialazer.factorialize(num)
//        );
//    }
//
//    @DisplayName("@ValueSource")
//    @ParameterizedTest(name = "Test: {index} - factorialize({arguments})")
//    @CsvSource({"1,1", "2, 2", "3, 6", "5, 120", "10, 3628800"})
//    void testItHarder(int num, int result) {
//        var factorialazer = new Factorializer();
//        assertEquals(factorialazer.factorialize(num), result);
//    }
//
//
//}
