import org.example.Novice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    Novice TestNovice = new Novice();

    @Test
    void testMain() {
        Integer counter = 0;
        for(int i = 0; i<=4; i++)
        {
            counter ++;

        }
        Assertions.assertEquals(5,counter);

    }
    @Test
    void testGreaterZero() {
        Assertions.assertEquals(true, TestNovice.Number(5));
    }

    @Test
    void testSquare() {
        Assertions.assertEquals(64, TestNovice.square(8));
    }

    @Test
    void testNameScanner() {
        TestNovice.printName();
    }

}
