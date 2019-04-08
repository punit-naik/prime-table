# prime-table

Generates a list of prime numbers and displays the result of multiplying that list with itself
in an array-like fashion as a table.

**NOTE**: Please install JAVA and LEININGEN before continuing

## Usage

### Build

```
./build.sh
```
### Run

The command below expects one argument:

```
./run.sh <n>
```

The code will work with a list of first `n` prime numbers

## Test

```
lein test
```

### Code Coverage Report

```
|-------------------+---------+---------|
|         Namespace | % Forms | % Lines |
|-------------------+---------+---------|
|  prime-table.core |   11.76 |   25.00 |
| prime-table.prime |  100.00 |  100.00 |
| prime-table.table |  100.00 |  100.00 |
|-------------------+---------+---------|
|         ALL FILES |   90.85 |   86.96 |
|-------------------+---------+---------|
```

## Docs

[API Docs](https://punit-naik.github.io/prime-table/)

## License

Copyright © 2019 [Punit Naik](https://github.com/punit-naik)

Distributed under the Eclipse Public License either version 1.0
