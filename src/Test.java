import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Float f = null;
        try {
            f = Float.valueOf("11");
            String s = f.toString();
            double d = Double.valueOf(s);
            int i = Integer.parseInt(s);
            System.out.println(d + " " + i);
        } catch (NumberFormatException e) {
            System.out.println(f);
        }

        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        System.out.println(hex); // 30 3A 8 FF
        int k = Collections.binarySearch(hex, "8");
        int m = Collections.binarySearch(hex, "3A");
        int n = Collections.binarySearch(hex, "4F");
        System.out.printf("%d %d %d%n", k, m, n); // 2 1 -3

    }
}
