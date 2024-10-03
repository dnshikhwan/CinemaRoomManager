import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // read the integer from the input
        int inputInteger = inputScanner.nextInt();

        // your code here - increase the integer by 1, then decrease it by 2, and finally increase it by 3
        inputInteger++;
        inputInteger -= 2;
        inputInteger += 3;

        // print the final computed integer
        System.out.println(inputInteger);
    }
}