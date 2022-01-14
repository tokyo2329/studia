import java.util.ArrayList;

public class zad4 {

    public static void main(String[] args) {

        ArrayList<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba(123456789L, "Mateusz", "Kowalski", 20, "Wroclaw", 1));
        osoby.add(new Osoba(123456789L, "Jakub", "Kowalski", 20, "Wroclaw", 3));
        osoby.add(new Osoba(123456789L, "Kamil", "Kowalski", 20, "Wroclaw", 2));
        osoby.add(new Osoba(123456789L, "Wojtek", "Kowalski", 20, "Wroclaw", 5));

        osoby.removeIf(b -> (b.getImie().startsWith("K")));

        for(Osoba o : osoby)
            System.out.println(o.toString());
    }

}
