import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    String car_price;
    String car_type;
    String car_transmission;

    @Override
    public void get_details(){
        System.out.println("Car Name: "+ car_name);
        System.out.println("Car Color: "+ car_color);
        System.out.println("Car Fuel Type: "+car_fuel_type);
        System.out.println("Car price: "+car_price);
        System.out.println("Car type: "+car_type);
        System.out.println("Car Transmission: "+car_transmission);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================**** ENTER CAR DETAILS *****===========================");
        System.out.println();
        System.out.println("ENTER CAR NAME: ");
        car_name = sc.nextLine();
        System.out.println("ENTER CAR COLOR: ");
        car_color = sc.nextLine();
        System.out.println("ENTER CAR FUEL TYPE(PETROL/DIESEL): ");
        car_fuel_type = sc.nextLine();
        System.out.println("ENTER CAR PRICE: ");
        car_price=sc.nextLine();
        System.out.println("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        car_type=sc.nextLine();
        System.out.println("CAR TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;

    }
}
