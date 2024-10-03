import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shapeHouse = scanner.nextLine();
        double area = 0.0;
        switch  (shapeHouse) {
            case "rectangle":
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                area = a * b;
                System.out.println(area);
                break;
            case "circle":
                int r =  scanner.nextInt();
                area = 3.14 * r * r;
                System.out.println(area);
                break;
            case "triangle":
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                int c = scanner.nextInt();
                double s = (A + B + c) / 2.0;
                area = Math.sqrt(s*(s-A)*(s-B)*(s-c));
                System.out.println(area);
                break;
        }
        
        
        scanner.close();
    }
}
