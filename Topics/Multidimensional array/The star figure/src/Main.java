import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String [][] starArray = new String[n][n];

        for (int i = 0; i < starArray.length; i++){
            for (int j = 0; j < starArray[i].length; j++){
                starArray[i][j] = ".";
                starArray[starArray.length / 2][j] = "*"; // ok
                starArray[i][starArray[i].length / 2] = "*";
                starArray[i][i] = "*";
                starArray[i][starArray.length - i - 1] = "*";
            }
        }

        for (int i = 0; i < starArray.length; i++){
            for (int j = 0; j < starArray[i].length; j++){
                System.out.print(starArray[i][j] + " ");
            }
            System.out.println();
        }


        scanner.close();
    }
}