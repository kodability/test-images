import static org.testng.AssertJUnit.*
import org.testng.annotations.*

class TestExample {

    @Test
    void test1() {
        Example e = new Example()
        assertEquals(55, e.sum(1, 10))
    }

    @Test
    void test2() {
        Example e = new Example()
        assertEquals(1, e.sum(1, 1))
    }
}