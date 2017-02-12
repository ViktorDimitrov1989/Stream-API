import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class PrE11OfficeStuff {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());


        HashMap<String, HashMap<String,Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            String[] orderInfo = line.substring(1,line.length() - 1).split(" - ");
            String company = orderInfo[0];
            String product = orderInfo[2];
            int amount = Integer.valueOf(orderInfo[1]);

            map.putIfAbsent(company, new LinkedHashMap<>());
            map.get(company).putIfAbsent(product, 0);
            map.get(company).put(product, map.get(company).get(product) + amount);
        }

        map.entrySet().stream()
                .sorted((a,b) -> a.getKey().compareTo(b.getKey()))
                .forEach(e -> {
                    StringBuilder sb = new StringBuilder();
                    e.getValue().entrySet().stream()
                            .forEach(v -> {
                                sb.append(v.getKey() + "-" + v.getValue() + ", ");
                            });
                    sb.replace(sb.length() - 2, sb.length()-1, "");
                    System.out.println(e.getKey() + ": " + sb);
                });
    }
}
