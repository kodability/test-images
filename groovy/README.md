# groovy test

## Setup
Download dependency files:

```bash
$ make dep
```

## How to test
Create source and test files in `src` directory. For example, `Foo.groovy` and `TestFoo.groovy`.

Compile source files:

```bash
$ make compile
```

Run Unittests. Set test class name to `TEST` environment variable:

```bash
$ TEST=TestFoo make test
```
