import static org.junit.Assert.*;
import org.junit.Test;

public class TestExample {

    @Test(timeout= 1000)
    public void test1() {
        Example e = new Example();
        assertEquals(55, e.sum(1, 10));
        assertEquals(1, e.sum(1, 1));
    }
}