import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void Example1() {
        assertEquals(4, Solution.characterReplacement("ABAB",2));
    }
    @org.junit.jupiter.api.Test
    void Example2() {
        assertEquals(4, Solution.characterReplacement("AABABBA",1));
    }
    @org.junit.jupiter.api.Test
    void Example3() {
        assertEquals(4, Solution.characterReplacement("ABBB",2));
    }
    @org.junit.jupiter.api.Test
    void Example4() {
        assertEquals(2, Solution.characterReplacement("ABAA",0));
    }
}