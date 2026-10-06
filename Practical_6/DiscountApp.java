import java.util.Scanner;

public class DiscountApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double[] prices =
        {
            1000,
            2000,
            3000,
            4000
        };

        System.out.println("Choose Discount Rule:");
        System.out.println("1. 10% Discount");
        System.out.println("2. 20% Discount");
        System.out.println("3. No Discount");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        DiscountRule rule;

        if (choice == 1)
        {
            rule = price -> price - (price * 0.10);
        }
        else if (choice == 2)
        {
            rule = price -> price - (price * 0.20);
        }
        else
        {
            rule = price -> price;
        }

        System.out.println("\nPrices after discount:");

        for (double price : prices)
        {
            System.out.println(price + " -> " + rule.apply(price));
        }

        System.out.println("\n25CE030 - KUSH GODHAVIYA");

        sc.close();
    }
}