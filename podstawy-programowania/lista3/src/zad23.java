import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class zad23 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("dane.txt"));

        ArrayList<String> input = new ArrayList<>();

        for (int i = 0; i < 1000; ++i) {
            input.add(i, sc.nextLine());
        }

        for (String entry : input) {
            if(czy_rosnace(entry)) System.out.println(entry);
        }

    }

    public static Boolean czy_rosnace(String wyraz) {
        for(int i = 1; i < wyraz.length(); ++i) {
            if(wyraz.charAt(i-1)>wyraz.charAt(i)) return false;
        }
        return true;
    }

}
