import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // TODO: Compare num1 and num2 using relational operators
        // Print '>' if num1 is greater than num2
        // Print '<' if num1 is less than num2
        // Print '=' if num1 is equal to num2
        if (num1 > num2){
            System.out.println(">");
        } else if (num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }

    }
}