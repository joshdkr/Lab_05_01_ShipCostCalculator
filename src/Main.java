import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double itemCost;
        double shipCost = 0;
        double totalCost;

        System.out.println("Enter the item price: ");
        itemCost = kb.nextDouble();

        if (itemCost >= 100) {
            shipCost = 0;
        }
        else if (itemCost < 100) {
            shipCost = itemCost * 0.02;
        }

        totalCost = itemCost + shipCost;
        System.out.println("Your item's price is: " + itemCost + ", your shipping cost is: " + shipCost + ", and your total price is: " + totalCost);






    }
}