import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pr02SequenceOfStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Arrays.stream(reader.readLine().split(" "))
                .forEach(a -> System.out.print(a.toUpperCase() + " "));
    }
}
