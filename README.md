# About

This is a Java SE 8 project that takes a number as an input and outputs a prettified string representation.

Numbers with 6 digits or less simply returns the exact input in string format.

Numbers in the millions, billions and trillions return a prettified string representation.

Examples:
   
    input: 532
    output: 532

    input: 1000000
    output: 1M

    input: 2500000.34
    output: 2.5M

    input: 1123456789
    output: 1.1B

    input: 9487634567534
    output: 9.5T


# Author

Emmanuel Rodriguez (erodrig9@gmail.com)


## Build

Use [maven](https://maven.apache.org/) to build and run the application test suite.

```bash
mvn package
```
or
```bash
mvn install
```


To run the Jacoco coverage report
```bash
mvn clean jacoco:prepare-agent install jacoco:report
```

To run the example application
```bash
java -cp target\classes com.mcg.app.App
```


## Usage

```java
import java.math.BigDecimal;
import com.mcg.prettifier.number.NumberPrettifier;
import com.mcg.prettifier.number.NumberPrettifierFactory;

BigDecimal number = BigDecimal.valueOf(2500000.34);
NumberPrettifier numberPrettifier = NumberPrettifierFactory.createNumberPrettifier(number);
System.out.println(numberPrettifier.prettify()); // outputs "2.5M"
```
