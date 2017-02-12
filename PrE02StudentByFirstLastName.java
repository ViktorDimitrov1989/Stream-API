import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class PrE02StudentByFirstLastName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        LinkedHashMap<String,List<String>> students = new LinkedHashMap<>();
        while (!"END".equals(line = reader.readLine())){
            String[] details = line.split(" ");
            String firstName = details[0];
            String lastName = details[1];
            students.putIfAbsent(firstName,new ArrayList<>());
            students.get(firstName).add(lastName);
        }




    }
}
