import java.io.File;
import java.io.FileNotFoundException;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class zad22 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("dane.txt"));

        ArrayList<String> input = new ArrayList<>();

        for (int i = 0; i < 1000; ++i) {
            input.add(i, sc.nextLine());
        }



        Map<String, Long> counts =
                input.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        for (Map.Entry<String, Long> entry : counts.entrySet()) {
            if(entry.getValue() > 1 ) System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

    }
}
