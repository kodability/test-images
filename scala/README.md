# scala test

## Setup
Download dependency files:

```bash
$ make dep
```

## How to test
Create source and test files in `src` directory. For example, `Foo.scala` and `TestFoo.scala`.

Compile source files:

```bash
$ make compile
```

Run Unittests. Set test class name to `TEST` environment variable:

```bash
$ TEST=TestFoo make test
```
