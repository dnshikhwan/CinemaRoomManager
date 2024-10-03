import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        // Your code to find the first perfect square greater than N goes here
        // Use a loop and the break statement when you find the answer
        for (int i = N+1; i <= 1000 && i >= 1; i++){
            if (Math.ceil(Math.sqrt(i)) == Math.floor(Math.sqrt(i))){
                System.out.println(i);
                break;
            }
        }

        // Print the result here
    }
}