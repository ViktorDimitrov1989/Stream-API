import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Pr04AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        OptionalDouble b = Arrays.stream(reader.readLine().split(" "))
                .filter(a -> !a.isEmpty())
                .mapToDouble(a -> Double.parseDouble(a))
                .average();


        if(b.isPresent()){
            System.out.printf("%.2f",b.getAsDouble());
        }
        else{
            System.out.println("No match");
        }


    }
}
