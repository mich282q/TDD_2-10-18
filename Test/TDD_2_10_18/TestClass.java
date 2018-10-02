package TDD_2_10_18;

import org.junit.jupiter.api.Test;


public  class TestClass {
    /**
     * Tester at Class findes i vores projekt
     */
    @Test
    public void DoesTheObjectExist() {
        try {
            Class.forName("TDD_2_10_18.Calculator");
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
            Class.forName("TDD_2_10_18.Testing");
        } catch (ClassNotFoundException e) {
            assert(false);
        }

    }}