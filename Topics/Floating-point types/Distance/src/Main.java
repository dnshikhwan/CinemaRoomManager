import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int travelTime = scanner.nextInt();

        float averageSpeed = distance / travelTime;
        System.out.printf("%.1f", averageSpeed);

        scanner.close();
    }
}