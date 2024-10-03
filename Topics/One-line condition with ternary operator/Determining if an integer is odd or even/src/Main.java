import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input number
        int number = scanner.nextInt();

        // Write a one-line condition using ternary operator to check if the number is even or odd
        // If the number is even, print "even"
        // Otherwise, print "odd"
        String result = number % 2 == 0 ? "even" : "odd";
        System.out.println(result);
    }
}