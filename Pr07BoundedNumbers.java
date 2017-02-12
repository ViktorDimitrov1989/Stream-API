import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pr07BoundedNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> bounds = Stream.of(reader.readLine().split(" "))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());

        Stream.of(reader.readLine().split(" "))
                .map(Integer::valueOf)
                .filter(x -> bounds.get(0) <= x && x <= bounds.get(1))
                .collect(Collectors.toList())
                .forEach(x -> System.out.print(x + " "));

    }
}
