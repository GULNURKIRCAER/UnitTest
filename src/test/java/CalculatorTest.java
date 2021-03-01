
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


class CalculatorTest {

    @Test
    @Order(1)
    void add() {
        System.out.println("add method called");
        int actual=Calculator.add(2,6);
        assertEquals(8,actual);
}
    @Test
    @Order(2)
    void TestCase1() {
        System.out.println("TC1 executed");
     assertEquals(20,20);
    }

    @Test
    @Order(3)
    void TestCase2() {
        System.out.println("TC2 executed");
        boolean result =Calculator.add(2,3)==5;
        assertTrue(result);

        assertTrue(Calculator.operator.equals("add"));
    }

    @Test
    @Order(4)
    void testCase3(){
        System.out.println("TC3 executed");
        assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});

        //failed
        //assertArrayEquals(new int[]{1,2,3,4},new int[]{1,2,3});
        //failed
        //assertArrayEquals(new int[]{1,2,3},new int[]{1,3,2});
    }

    @Test
    @Order(5)
    void TestCase4() {
        System.out.println("TC4 executed");
        String nullString=null;
        String notNullString ="SDET";

        assertNull(nullString);

        assertNotNull(notNullString);
        //failed
        //assertNull(notNullString);
        //failed
        //assertNotNull(nullString);
    }

    @Test
    @Order(6)
    void TestCase5() {
        System.out.println("TC5 executed");
        Calculator c1=new Calculator();
        Calculator c2=c1;
        Calculator c3=new Calculator();

        assertNotSame(c1,c3);

        //assertNotSame(c1,c2);

        assertSame(c1,c2);

        //assertSame(c1,c3);
    }
    @BeforeEach
    void setUpEach(){
        System.out.println("BeforeEach is executed");
    }

    @BeforeAll
    static void setUpAll(){
        System.out.println("BeforeAll is executed");
    }

    @AfterAll

    static void tearAll(){
        System.out.println("AfterAll is executed");
    }

    @AfterEach
    void tearEach(){
        System.out.println("AfterEach is executed");
    }

    }