import java.util.ArrayList;
import java.util.Scanner;

public class Lab3 {

    // arrays
    private static ArrayList<String> seats = new ArrayList<>();
    private static ArrayList<Integer> total = new ArrayList<>();
    private static int[][] seatChart = {{30, 40, 50, 50},
                                        {20, 30, 30, 40}, 
                                        {20, 20, 30, 30},
                                        {10, 10, 20, 20}};
    public static void main(String[] args){

        boolean check = true;
        
        // Scanner initalize
        Scanner userInput = new Scanner(System.in);

        // while loop
        while(check){
            // Print seating chart
            printSeatChart();

            // Display message
            System.out.println("\nPick a seat. Enter which row (1-4) and which seat# (1-4) in that row you want to purchase, separate the row# and seat# by using dash. To exit type 'e'");
            String userIn = userInput.nextLine();
            
            // Exit loop
            if (userIn.equalsIgnoreCase("E")){
                check = false;
                continue;
            }

            seats.add(userIn);
            String[] str = userIn.split("-",2);

            int row = Integer.parseInt(str[0])-1;
            int column = Integer.parseInt(str[1])-1;

            // Check if seat taken
            if (seatChart[row][column] != 0){
                total.add(seatChart[row][column]);
                seatChart[row][column] = 0;
            } else{
                System.out.println("The seat has been taken");
            }

        }
        // print total
        int a = 0;
        for (Integer e : total)
            a += e;
        System.out.println("Total ticket price is: " + a);
        userInput.close();
    }
    // print seat chart
    public static void printSeatChart(){
        for(int[] row : seatChart){
            for (int column : row){
                System.out.print(column + " ");
            }
            System.out.print("\n");
        }
        
    }
}
