import java.util.Scanner;

/*
 * Java Program to check if one String is rotation of
 * another.
 */
public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scnr = new Scanner(System.in);
    String input = scnr.nextLine();

    String rotation = scnr.nextLine();

    if (checkRotatation(input, rotation)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    scnr.close();
  }

  /**
   * This method check is given strings are rotation of each other
   * @param original
   * @param rotation
   * @return true or false
   */
  public static boolean checkRotatation(String original, String rotation) {
    if (original.length() != rotation.length()) {
      return false;
    }

    String concatenated = original + original;

    if (concatenated.indexOf(rotation) != -1) {
      return true;
    }

    return false;
  }
}