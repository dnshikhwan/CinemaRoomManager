import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int [] array = new int[len];

        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        // example len = 4
        // element = { 1, 2, 3, 4 }
        boolean bool = true;
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[i - 1]){
                bool = false;
                break;
            }
        }

        System.out.println(bool);
        sc.close();
    }
}