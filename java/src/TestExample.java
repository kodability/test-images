import static org.testng.AssertJUnit.*;
import org.testng.annotations.*;

public class TestExample {

    @Test
    public void test1() {
        Example e = new Example();
        assertEquals(55, e.sum(1, 10));
    }
    @Test
    public void test2() {
        Example e = new Example();
        assertEquals(1, e.sum(1, 1));
    }
}