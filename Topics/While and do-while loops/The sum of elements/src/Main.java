import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        do {
            int input = scanner.nextInt();
            if (input != 0){
                sum += input;
            } else {
                break;
            }
        } while (scanner.hasNextInt());

        System.out.println(sum);

        scanner.close();
    }
}