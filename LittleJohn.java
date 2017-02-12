import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LittleJohn {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int smallArrow = 0;
        int medArrow = 0;
        int largeArrow = 0;

        for (int i = 0; i < 4; i++) {
            Pattern largeArrowPattern = Pattern.compile("((?:[>]{3})[-]{5}[>]{2})");
            Pattern medArrowPattern = Pattern.compile("((?:[>]{2})[-]{5}[>]{1})");
            Pattern smallArrowPattern = Pattern.compile("((?:[>]{1})[-]{5}[>]{1})");

            StringBuilder line = new StringBuilder().append(reader.readLine());

            Matcher largeMatcher = largeArrowPattern.matcher(line);
            while (largeMatcher.find()){
                largeArrow++;
                line.replace(largeMatcher.start(), largeMatcher.end(), "");
                largeMatcher = largeArrowPattern.matcher(line);
            }
            Matcher medMatcher = medArrowPattern.matcher(line);
            while (medMatcher.find()){
                medArrow++;
                line.replace(medMatcher.start(), medMatcher.end(), "");
                medMatcher = medArrowPattern.matcher(line);
            }
            Matcher smallMatcher = smallArrowPattern.matcher(line);
            while (smallMatcher.find()){
                smallArrow++;
                line.replace(smallMatcher.start(), smallMatcher.end(), "");
                smallMatcher = smallArrowPattern.matcher(line);
            }

        }
        String num = "" + smallArrow + medArrow + largeArrow;

        StringBuilder message = new StringBuilder().append(Integer.toBinaryString(Integer.valueOf(num)));
        StringBuilder reversed = new StringBuilder().append(message).reverse();

        message.append(reversed);

        int finalNum = Integer.parseInt(message.toString(),2);
        System.out.println(finalNum);
    }
}
