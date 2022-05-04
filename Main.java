import java.util.*;
import java.util.Scanner;

class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Item \t\tPrice \tFat(g) \tCarbohydrates(g) \tFiber(g)");
        System.out.println("Hamburger \t$1.85 \t9 \t\t33 \t\t1");
        System.out.println("Salad \t\t$2.00 \t1 \t\t11 \t\t5");
        System.out.println("French Fries \t$1.30 \t11 \t\t36 \t\t4");
        System.out.println("Soda \t\t$0.95 \t0 \t\t38 \t\t0");

        System.out.println("\nEnter number of Hamburgers: ");
        double hamburgers = in.nextDouble();
        System.out.println("Each Hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.");

        System.out.println("\nEnter number of Salad: ");
        double salads = in.nextDouble();
        System.out.println("Each Salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.");

        System.out.println("\nEnter number of French Fries: ");
        double frenchFries = in.nextDouble();
        System.out.println("Each French Fries has 11.0g of fat, 36.0g of carbs, and 4.0g of fiber.");

        System.out.println("\nEnter number of Soda: ");
        double sodas = in.nextDouble();
        System.out.println("Each Soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.");

        LunchOrder Food = new LunchOrder(hamburgers, salads, frenchFries, sodas);
        System.out.println("\nYour order comes to: $" +Food.value());
    }
}