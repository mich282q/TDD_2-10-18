package TDD_2_10_18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hallo_World_Test {
    @Test

    public void test() {
        Testing testing = new Testing("TDD_2_10_18/Hallo World");
        assertEquals("TDD_2_10_18/Hallo World", testing.getMessage());

    }

        @Test

        public void test1() {
            Testing testing = new Testing("TDD_2_10_18/Hallo World");
            assertEquals("Is't right", testing.getMessage());

        }
}
