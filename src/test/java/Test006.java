//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class Test006 {
//
//    @Test
//    @DisplayName("AssertJ example")
//    void aj() {
//        assertThat("The Lord of the Rings").isNotNull()
//                .startsWith("The")
//                .contains("Lord")
//                .endsWith("Rings");
//    }
//
//    @Test
//    @DisplayName("AssertJ list example")
//    void ajList() {
//        var friends = List.of("Tom", "Jerry", "Fox");
//
//        assertThat(friends).contains("Tom", "Jerry")
//                .doesNotContain("Mick");
//    }
//
//    @Test
//    @DisplayName("AssertJ list example")
//    void ajObject() {
//        class Person {
//            private String name;
//            private int age;
//
//            public Person(String name, int age) {
//                this.name = name;
//                this.age = age;
//            }
//
//            public int getAge() {
//                return age;
//            }
//        }
//        var tom = new Person("Tom", 18);
//
//        assertThat(tom.getAge()).isBetween(15,20);
//        assertThat(tom).hasFieldOrPropertyWithValue("name", "Tom"); // private
//    }
//}
