package cinema;

import java.util.Scanner;

/*
* 1. store the booked seats [X]
* 2. calculate the total income if all tickets are sold [X]
* 3. based on the booked seats, output the current income [X]
* 4. number of percentage tickets sold, divide by total income if all tickets are sold [X]
* 5. ticket that already sold, cant be purchased again [X]
* 6. if user chooses sold ticket, print error, ask them to enter other seats until they pick available seats []
* 7. handle seats that are out of bounds, enter seat until available []
*/

public class Cinema {
    public static void main(String[] args) {
        // try making it into method
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int column = scanner.nextInt();

        String [][] cinema = new String[row][column];

        for (int i = 0; i < cinema.length; i++){
            for (int j = 0; j < cinema[i].length; j++) {
                cinema[i][j] = "S";
            }
        }

        int ticketSold = 0;
        int currentSales = 0;
        float percentage = 0;

        // user menu
        int choice;
        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printCinemaSeat(cinema, column);
                    break;
                case 2:

                    int seatRow = 0;
                    int seatColumn = 0;

                    while (true) {
                        System.out.println("\nEnter a row number:");
                        seatRow = scanner.nextInt();

                        System.out.println("Enter a seat number in that row:");
                        seatColumn = scanner.nextInt();

                        if (seatRow > row || seatColumn > column) {
                            System.out.println("\nWrong input!");
                        } else {
                            if ("B".equals(cinema[seatRow - 1][seatColumn - 1])){
                                System.out.println("\nThat ticket has already been purchased!");
                            } else {

                                int ticketPrice = calculateSeatPrice(row, column, seatRow, seatColumn, cinema);
                                System.out.println("\nTicket price: $" + ticketPrice);
                                bookSeat(seatRow, seatColumn, cinema);
                                currentSales += ticketPrice;
                                ticketSold++;
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    if (ticketSold != 0){
                        percentage = ((float) ticketSold / (row * column)) * 100;
                    }
                    printStatistics(row, column, ticketSold, currentSales, percentage);
                    break;
            }
        } while (choice != 0 && choice <= 3);

        scanner.close();
    }

    // method to print the user menu
    public static void printMenu(){
        System.out.println("\n1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    // method to print cinema seat in the hall
    public static void printCinemaSeat(String[][] cinema, int column){
        System.out.println("\nCinema:");
        System.out.print("  ");
        for (int i = 1; i <= column; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < cinema.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }

    // method to print the seat price based on the tickets calculation
    public static int calculateSeatPrice(int row, int column, int seatRow, int seatColumn, String[][] cinema){
        // seat selection
        // seat price calculation
        int ticketPrice = 0;
        if (row * column < 60){
            ticketPrice = 10;
        } else {
            if (seatRow > row / 2){
                ticketPrice = 8;
            } else {
                ticketPrice = 10;
            }
        }
        return ticketPrice;
    }

    // method to update the book seat into "B"
    public static void bookSeat(int seatRow, int seatColumn, String[][] cinema) {
        cinema[seatRow - 1][seatColumn - 1] = "B";
    }

    // method to calculate the total sales in the hall
    public static int calculateTotalSales(int row, int column) {
        int sales = 0;
        if (row * column < 60) {
            sales = row * column * 10;
        } else if((row * column) > 60 && row % 2 == 0) {
            sales = (row / 2) * column * 10;
            sales += (row / 2) * column * 8;
        } else {
            int salesFirstHalf = (row / 2) * column * 10;
            int salesSecondHalf = (row - (row / 2)) * column * 8;
            sales = salesFirstHalf + salesSecondHalf;
        }
        return sales;
    }

    // method to calculate the cinema statistics and print it
    public static void printStatistics(int row, int column, int ticketSold, int currentIncome, float percentage) {
        System.out.println("\nNumber of purchased tickets: " + ticketSold);
        System.out.printf("Percentage: %.2f%%", percentage);
        System.out.println("\nCurrent income: $" + currentIncome);
        // how much money if all tickets in the hall are sold
        System.out.println("Total income: $" + calculateTotalSales(row, column));
    }
}