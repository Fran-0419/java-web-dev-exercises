package exercises;
import java.util.Scanner;

public class MilesPerGall {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();
        System.out.println("How many gallons of gas have you used ?");
        Double gallons = input.nextDouble();
        input.close();

        Double milesPGas = miles / gallons;
        System.out.println( "The miles-per-gallon in your vehicle is : " + milesPGas);
    }
}
