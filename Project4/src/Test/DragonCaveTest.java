import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class DragonCaveTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void userSelection(){
        String option1 = "\n" +
                "You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!";
        String option2 = "\n" +
                "You approach the cave...\n" +
                "It is dark and mysterious...\n" +
                "A large dragon appears in front of you and allows you to access he's treasures";
        String invalid = "\nPlease pick 1 or 2";

        assertEquals(option1,DragonCave.userSelection(1));
        assertEquals(option2,DragonCave.userSelection(2));
        assertEquals(invalid,DragonCave.userSelection(3));

    }

    @AfterEach
    void tearDown() {
    }
}