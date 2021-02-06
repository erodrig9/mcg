package com.mcg.app;

import java.util.Scanner;
import java.math.BigDecimal;
import com.mcg.prettifier.number.NumberPrettifier;
import com.mcg.prettifier.number.NumberPrettifierFactory;

public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter a number: ");
    BigDecimal number = input.nextBigDecimal();

    NumberPrettifier numberPrettifier = NumberPrettifierFactory.createNumberPrettifier(number);
    System.out.println("Prettified number: " + numberPrettifier.prettify());

    input.close();
  }
}
