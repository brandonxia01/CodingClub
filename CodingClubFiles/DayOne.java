
class DayOne {

  public static void main(String[] args) {
    /* Code Goes Here */  
    exampleFunction();
    exampleIfStatement(45);
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