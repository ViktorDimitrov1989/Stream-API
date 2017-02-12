import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Pr03StudentsByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        LinkedHashMap<String,Integer> firstNameAge = new LinkedHashMap<>();
        HashMap<String,String> firstLastName = new HashMap<>();
        while (!"END".equals(line = reader.readLine())){
            String[] details = line.split(" ");
            String firstName = details[0];
            String lastName = details[1];
            Integer age = Integer.parseInt(details[2]);

            firstNameAge.putIfAbsent(firstName,age);
            firstLastName.putIfAbsent(firstName,lastName);
        }


        firstNameAge.entrySet().stream()
                .filter(e -> e.getValue() <= 24 && e.getValue() >= 18)
                .forEach(e -> System.out.printf("%s %s %d%n", e.getKey(), firstLastName.get(e.getKey()), e.getValue()));

    }
}
