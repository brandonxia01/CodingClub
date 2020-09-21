import utils.*

class DayOne {

  public static void main(String[] args) {
    int startTime = System.currentTimeMillis();

    /* Code Goes Here */
    exampleFunction();
    exampleIfStatement(45);

    FileReader fileReader = new FileReader();

    String[] lines = readFile("~/CodingClub/assets/01.txt");
    System.out.println("lines = " + lines[0] + lines[1]);


    int endTime = System.currentTimeMillis();
    System.out.println("Program took " + (double (startTime - endTime)) / 1000) + " seconds to finish."
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