import java.util.Scanner;

public class zad8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2 = 1, n3;

        System.out.println("Podaj ile liczb z ciagu fibonacciego wyswietlic");
        int how_many = sc.nextInt();

        for(int i = 0; i < how_many; ++i) {

            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;

        }

    }

}
