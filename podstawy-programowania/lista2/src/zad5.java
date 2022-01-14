import java.util.PriorityQueue;

public class zad5 {

    public static PriorityQueue<Osoba> kolejka = new PriorityQueue<>();

    public static void main(String[] args) {

        zarejestruj(new Osoba(123456789L, "Mateusz", "Kowalski", 20, "Wroclaw", 1));
        zarejestruj(new Osoba(123456789L, "Jakub", "Kowalski", 20, "Wroclaw", 3));
        zarejestruj(new Osoba(123456789L, "Kamil", "Kowalski", 20, "Wroclaw", 2));
        zarejestruj(new Osoba(123456789L, "Wojtek", "Kowalski", 20, "Wroclaw", 5));

        System.out.println(wywolaj());
        System.out.println(wywolaj());
        System.out.println(wywolaj());
        System.out.println(wywolaj());

    }

    public static void zarejestruj(Osoba o) {
        kolejka.add(o);
    }

    public static Osoba wywolaj() {
        return kolejka.poll();
    }
}
