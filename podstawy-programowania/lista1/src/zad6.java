import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cena;
        int raty;

        System.out.print("Podaj cene: ");
        do {
            cena = sc.nextInt();
        } while (cena<=0 || cena > 50000);

        System.out.print("Podaj ile rat: ");
        do {
            raty = sc.nextInt();
        } while(raty<1 || raty>48);

        double rata = 0;

        if(raty<=12)
            rata = cena/raty * 1.03;
        else if(raty>12 && raty<=24)
            rata = cena/raty * 1.06;
        else if(raty>24)
            rata = cena/raty * 1.12;

        System.out.println("Rata wynosi: " + rata);
    }
}
