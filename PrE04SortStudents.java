import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PrE04SortStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        ArrayList<String> students = new ArrayList<>();
        while (!"END".equals(line = reader.readLine())){
            students.add(line);
        }

        students.stream()
                .sorted((e1,e2) -> compare(e1,e2))
        .forEach(s -> System.out.println(s));
    }

    private static int compare(String el1, String el2) {
        String firstLast = el1.split(" ")[1];
        String secLast = el2.split(" ")[1];
        int comp = firstLast.compareTo(secLast);
        if(comp != 0){
            return comp;
        }
        else{
            return el2.split(" ")[0].compareTo(el1.split(" ")[0]);
        }
    }
}
