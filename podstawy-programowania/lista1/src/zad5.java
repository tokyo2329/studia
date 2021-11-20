import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class zad5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        double r = sc.nextInt();

        double area = 4*3.14*pow(r,2);
        double volume = 1.33*3.14*pow(r,3);

        System.out.println("Circles' area: " + round(area) + " and volume: " + round(volume));

    }
}
