import java.util.Scanner;

public class zad7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Wpisz dzialanie (np. 2 + 2) ((pamietaj o spacjach)):");
            String dzialanie = sc.nextLine();
            String[] input = dzialanie.split(" ");

            double liczba1 = Double.parseDouble(input[0]);
            String opcja = input[1];
            double liczba2 = Double.parseDouble(input[2]);

            switch (opcja) {
                case "+":
                    System.out.println(liczba1 + liczba2);
                    break;
                case "-":
                    System.out.println(liczba1 - liczba2);
                    break;
                case "*":
                    System.out.println(liczba1 * liczba2);
                    break;
                case "/":
                    if(liczba2 != 0)
                        System.out.println(liczba1 / liczba2);
                    else System.out.println("Nie mozna dzielic przez 0!");
                    break;
                default:
                    System.out.println("Blad, sprobuj ponownie");
            }

        }

    }

}
