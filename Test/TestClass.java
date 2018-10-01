import mich282q.Testing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public  class TestClass {
    /**
     * Tester at Class findes i vores projekt
     */
    @Test
    public void DoesTheObjectExist() {
        try {
            Class.forName("mich282q.Calculator");
        } catch (ClassNotFoundException e) {
            assert(false);
        }


    }
    /**
     * Tester at Class ikke findes i vores projekt
     */
    @Test
    public void DoesTheObjectExist1() {
        try {
            Class.forName("mich282q.Testing");
        } catch (ClassNotFoundException e) {
            assert(false);
        }

    }}