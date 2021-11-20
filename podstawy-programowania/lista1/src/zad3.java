import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] liczby = new int[3];

        System.out.println("Enter three numbers");

        for(int i=0; i<3; ++i) {
            liczby[i] = sc.nextInt();
        }

        int max = liczby[0];

        for(int i=1; i<liczby.length; ++i) {
            if(max<liczby[i])
                max = liczby[i];
        }

        System.out.println("The maximum number is " + max);

    }
}
