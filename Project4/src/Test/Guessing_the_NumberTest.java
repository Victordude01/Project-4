import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class Guessing_the_NumberTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void verifyName(){
        boolean option1 = false; //if it's false then the argument is valid, therefore the loop can end.
        boolean option2 = true;

        assertEquals(option1,Guessing_the_Number.verifyName("John"),"Option1");
        assertEquals(option2,Guessing_the_Number.verifyName("1"),"Option2");
    }

    @Test
    void verifyNumber(){
        boolean option1 = false;
        boolean option2 = true;

        assertEquals(option1,Guessing_the_Number.verifyNumber(1),"Option1");
        assertEquals(option2,Guessing_the_Number.verifyNumber(21),"Option2");
    }

    @AfterEach
    void tearDown() {
    }
}