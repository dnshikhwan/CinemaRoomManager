import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int [] array = new int[len];

        for (int i = 0; i < len; i++){
            array[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean isOccur = true;
        for (int i = 0; i < array.length - 1; i++){
            if ((array[i] == n && array[i+1] == m) || (array[i] == m && array[i+1] == n)){
                isOccur = false;
                break;
            }
        }

        System.out.println(isOccur);

        sc.close();
    }
}