import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] params = {"Brand", "Model", "Color", "Power (hp)", "AWD, FWD or RWD?", "Production year", "Mileage (km)", "Engine size"};
        String[] answers = new String[8];

        System.out.println("Enter your cars' information");

        for(int i=0; i<params.length; ++i) {

            System.out.print(params[i] + ": ");
            answers[i] = sc.nextLine();

        }

        for(int i=0; i<params.length; ++i) {

            System.out.println(params[i] + ": " + answers[i]);

        }
    }
}
