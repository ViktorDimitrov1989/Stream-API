import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Pr05MinEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = Arrays.asList(reader.readLine().split(" "));


        OptionalDouble num = list.stream()
                .filter(x -> !x.isEmpty())
                .mapToDouble(x -> Double.valueOf(x))
                .filter(x -> x % 2 == 0)
                .min();

        if(num.isPresent()){
            System.out.printf("%.2f", num.getAsDouble());
        }
        else{
            System.out.println("No match");
        }
    }
}
