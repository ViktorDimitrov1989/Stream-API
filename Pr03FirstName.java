import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Pr03FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> names = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));


        HashSet<Character> letters = new HashSet<>();
        Stream.of(reader.readLine().split(" "))
                .map(x -> x.toLowerCase().charAt(0))
                .forEach(x -> letters.add(x));

        Optional<String> firstName = names.stream()
                .filter(x -> letters.contains(x.toLowerCase().charAt(0)))
                .sorted()
                .findFirst();

        if(firstName.isPresent()){
            System.out.println(firstName.get());
        }
        else{
            System.out.println("No match");
        }
    }
}
