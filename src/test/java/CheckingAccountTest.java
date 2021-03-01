import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    CheckingAccount checkingAccount;
    public static int count;

    @BeforeAll
    static  void BeforeAll(){
        System.out.println("count = " +count++);
    }
    @BeforeEach
    void setUp() {
        checkingAccount=new CheckingAccount();
        checkingAccount.setInfo(100,1234567L,"GULNUR");
    }

    @AfterEach
    void tearDown() {
        System.out.println("count = " +count++);
    }
    @AfterAll
    static void AfterAll(){
        System.out.println("after any TC="+count++);
    }

    @Test
    void deposit() {
        assertEquals(300,checkingAccount.deposit(200));
    }

    @Test
    void withDraw() {
        assertEquals(80,checkingAccount.withDraw(20));
    }

    @Test
    void withDraw_branch(){
        assertThrows(IllegalArgumentException.class,()->{
            checkingAccount.withDraw_branch(600,false);
        });

        assertThrows(RuntimeException.class,()->{
            checkingAccount.withDraw_branch(600,false);
        });
    }

    @Test
    void purchase() {
        assertEquals(-65,checkingAccount.purchase("Shoes",130));
    }

}