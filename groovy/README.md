# groovy test

## Setup
Download dependency files:

```bash
$ make dep
```

## How to test
Create source and test files in `src` directory. For example, `Foo.groovy` and `FooSpec.groovy`.

Compile source files:

```bash
$ make compile
```

Run Unittests. Set test class name to `TEST` environment variable:

```bash
$ TEST=FooSpec make test
```
