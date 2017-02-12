import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrE05FilterStudentsByEmailDomain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        ArrayList<String> students = new ArrayList<>();
        while (!"END".equals(line = reader.readLine())){
            students.add(line);
        }

        students.stream()
                .filter((el) -> filter(el))
                .forEach(s -> System.out.println(getLine(s)));


    }

    private static String getLine(String s) {
        String[] tokens = s.split(" ");
        return tokens[0] + " " + tokens[1];
    }

    private static boolean filter(String el) {
        String[] tokens = el.split(" ");
        if(tokens[2].contains("@gmail.com")){
            return true;
        }
        return false;
    }

}
