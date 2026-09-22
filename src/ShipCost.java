import java.util.Scanner;

public class ShipCost {
    static void main() {

        Scanner in = new Scanner(System.in);

        double price = 0;
        double shipCost = 0;
        double totalCost = 0;
        String trash = "";

        IO.print("Enter your item price: ");

        if(in.hasNextDouble())
        {
            price = in.nextDouble(); //Read the value
            in.nextLine(); // Clear the new line from the key buffer
        }
        else
        {
            trash = in.nextLine();
            IO.println("You must enter a valid number, not " + trash);
            IO.println("Rerun the program and try again!");
            System.exit(0);
        }

        // We got correct input so use it

        if(price >= 100){
            shipCost = 0;
            totalCost = price;
        }
        else
        {
            shipCost = price * 0.02;
            totalCost = price + shipCost;
        }

        //display results

        IO.println("The shipping cost is: " + shipCost);
        IO.println("The total cost is: " + totalCost);





    }
}
