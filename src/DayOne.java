import utils.*;
import java.util.*;


class DayOne {

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    FileReader fileReader = new FileReader();
    String[] lines = fileReader.readFile("../assets/01.txt");


    /* Code Goes Here */

    for (int i = 0; i < lines.length; i++) {
      System.out.println(lines[i]);
      if (i > 50) {
        break;
      }
    }



    

    // Leave these be.
    double endTime = System.currentTimeMillis();
    System.out.println("\nProgram took " + ((endTime * 1.0 - startTime) / 1000) + " seconds to finish.");
  }

  public static void exampleFunction() {
    System.out.println("Hello World!");
  }

  public static void exampleIfStatement(int number) {
    if (number < 10) {
      System.out.println(number + " is less than 10.");
    } else if (number <= 50) {
      System.out.println(number + " is between 10 and 50.");
    } else {
      System.out.println(number + " is greater than 50.");
    }
  }

  /* More functions can go here */

}