import java.util.Scanner;
import java.util.Arrays;

public class zad4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers");

        for(int i=0; i<5; ++i)
            numbers[i] = sc.nextInt();

        Arrays.sort(numbers);

        for(int i=0; i<5; ++i)
            System.out.print(numbers[i] + " ");

    }
}
