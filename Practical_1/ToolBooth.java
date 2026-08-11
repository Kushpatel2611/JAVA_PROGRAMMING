import java.util.Scanner;

public class ToolBooth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalToll = 0;
        int bikeCounter = 0;
        int carCounter = 0;
        int truckCounter = 0;

        while (true) {

            System.out.print("Enter vehicle number (or Done to exit): ");
            String number = sc.next();

            if (number.equalsIgnoreCase("Done")) {
                break;
            }

            System.out.print("Enter vehicle type (bike, car, truck): ");
            String type = sc.next().toLowerCase();

            int toll = 0;

            switch (type) {

                case "bike":
                    toll = 20;
                    bikeCounter++;
                    break;

                case "car":
                    toll = 30;
                    carCounter++;
                    break;

                case "truck":
                    toll = 150;
                    truckCounter++;
                    break;

                default:
                    System.out.println("Invalid vehicle type");
                    continue;
            }

            totalToll = totalToll + toll;

            System.out.println("Vehicle Number: " + number);
            System.out.println("Toll: " + toll);
        }

        System.out.println("\nTotal Toll: " + totalToll);
        System.out.println("Total Bikes: " + bikeCounter);
        System.out.println("Total Cars: " + carCounter);
        System.out.println("Total Trucks: " + truckCounter);

        if (bikeCounter > carCounter && bikeCounter > truckCounter) {
            System.out.println("Most vehicles are Bikes");
        }
        else if (carCounter > bikeCounter && carCounter > truckCounter) {
            System.out.println("Most vehicles are Cars");
        }
        else if (truckCounter > bikeCounter && truckCounter > carCounter) {
            System.out.println("Most vehicles are Trucks");
        }
        else {
            System.out.println("There is a tie");
        }

        sc.close();
    }
}