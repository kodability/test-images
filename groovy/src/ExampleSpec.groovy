import spock.lang.*

class ExampleSpec extends Specification {
    @Timeout(value=5)
    @Unroll
    def test1(int from, int to, int expected) {
        when:
        def Example e = new Example()

        then:
        e.sum(from, to) == expected

        where:
        from | to | expected
        1    | 10 | 55
        1    | 1  | 1
    }
}