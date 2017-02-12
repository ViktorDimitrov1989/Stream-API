import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class PrE01StudentsByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        HashMap<String,HashMap<String, Integer>> students = new HashMap<>();
        while (!"END".equals(line = reader.readLine())){
            String[] details = line.split(" ");
            String firstName = details[0];
            String lastName = details[1];
            int group = Integer.valueOf(details[2]);
            students.putIfAbsent(firstName,new HashMap<>());
            students.get(firstName).put(lastName, group);
        }

        students.entrySet().stream()
                .sorted((a,b) -> a.getKey().compareTo(b.getKey()))
                .forEach(a ->{
                            a.getValue().entrySet().stream()
                                    .filter(x -> x.getValue() == 2)
                                    .forEach(e -> System.out.printf("%s %s%n",a.getKey(), e.getKey()));
                        }
                        );
    }
}
