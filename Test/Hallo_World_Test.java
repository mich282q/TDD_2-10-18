import mich282q.Testing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hallo_World_Test {
    @Test

    public void test() {
        Testing testing = new Testing("Hallo World");
        assertEquals("Hallo World", testing.getMessage());

    }

        @Test

        public void test1() {
            Testing testing = new Testing("Hallo World");
            assertEquals("Is't right", testing.getMessage());

        }
}
