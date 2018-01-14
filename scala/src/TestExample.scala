import org.testng.AssertJUnit._
import org.testng.annotations._

class TestExample {

    @Test(timeOut= 1000L)
    def test1(): Unit = {
        val e = new Example()
        assertEquals(55, e.sum(1, 10))
        assertEquals(1, e.sum(1, 1))
    }
}