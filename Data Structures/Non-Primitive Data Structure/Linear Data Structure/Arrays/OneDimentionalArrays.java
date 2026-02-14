import java.util.Scanner;

public class OneDimentionalArrays {
  public static void main(String args[]) {

    // 1. One dimentional array
    String[] days;
    days = new String[7];
    days[0] = "Sunday";
    days[1] = "Monday";
    days[2] = "Tuesday";
    days[3] = "Wednesday";
    days[4] = "Thursday";
    days[5] = "Friday";
    days[6] = "Saturday";

    for (int i = 0; i < days.length; i++) {
      System.out.println(days[i]);
    }

    // Write a Java program that creates an integer array of size 5, takes input from the user, and
    // prints the sum and  average of all elements.
    // 1. Array = 5 size
    // 2. Takes input from the user
    // 3. prints the sum of the elements that user gave us
    // 4. average of all elements
    int[] arr;
    arr = new int[5];
    // Take input from user in terminal
    // nextInt() a  method of Scanner class takes the user input
    System.out.println("Enter Five Int Values Below");
    Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    // arr[0] = sc.nextInt()
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
      System.out.println("Number " + i + " = " + arr[i]);
    }

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    double avg = (double) sum / arr.length;
    System.out.println(
        "Sum of the number you enter is: "
            + sum
            + "\n"
            + "Average of the number you entered is: "
            + avg);

    // Write a Java program that creates an integer array of size 6, takes input from the user, and
    // prints the largest and smallest number in the array.
    // 1. Array size = 6
    // 2. Takes input from the user
    // 3. print the largest
    // 4. prints the smallest
    int[] arr2;
    arr2 = new int[6];
    int largest = arr2[0];
    int smallest = arr2[0];
    for (int i = 0; i < arr2.length; i++) {

      arr2[i] = sc.nextInt();
      if (i == 0) {
        largest = arr2[0];
        smallest = arr2[0];
      }
      if (largest < arr2[i]) {
        largest = arr2[i];
      }
      // let say first index 0 = 2, second is = 1; how to assign the second to smallest

      if (arr2[i] < smallest) {
        smallest = arr2[i];
      }
    }
    System.out.println(
        "Largest number you enter is : "
            + largest
            + "\n"
            + "Smallest number you entered is: "
            + smallest);
  }
}
