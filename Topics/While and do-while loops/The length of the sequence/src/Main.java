import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = -1;
        int num;

        do {
            num = scanner.nextInt();
            sum += 1;
        } while (num != 0);

        System.out.println(sum);
        scanner.close();
    }
}