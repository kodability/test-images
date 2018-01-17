from unittest import TestCase, main
from example import sum
from xmlrunner import XMLTestRunner

class ExampleTestCase(TestCase):
    def test_sum(self):
        self.assertEqual(55, sum(1, 10))

if __name__ == '__main__':
    main(
        testRunner=XMLTestRunner(output='report'),
        failfast=False, buffer=False, catchbreak=False)
