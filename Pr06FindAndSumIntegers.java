import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Pr06FindAndSumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = Arrays.asList(reader.readLine().split(" "));

        int num = list.stream()
                .filter(x -> isNumber(x))
                .mapToInt(x -> Integer.valueOf(x))
                .sum();

        if(num != 0){
            System.out.println(num);
            return;
        }
        System.out.println("No match");

    }

    private static boolean isNumber(String x) {
        if(x.isEmpty()){
            return false;
        }
        try{
            Double.valueOf(x);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
