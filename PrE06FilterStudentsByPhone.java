import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrE06FilterStudentsByPhone {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        ArrayList<String> students = new ArrayList<>();
        while (!"END".equals(line = reader.readLine())){
            students.add(line);
        }

        students.stream()
                .filter(a -> filterStudents(a))
                .forEach(s -> System.out.println(getLine(s)));
    }

    private static String getLine(String s) {
        String[] tokens = s.split(" ");
        return tokens[0] + " " + tokens[1];
    }

    private static boolean filterStudents(String a) {
        String pattern = "((?:02|\\+359)[0-9]+)";
        return a.split(" ")[2].matches(pattern);
    }
}
