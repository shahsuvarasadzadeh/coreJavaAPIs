import java.util.ArrayList;
import java.util.List;

public class _Autoboxing {
    public static void main(String[] args) {
        /**
         *
         * autoboxing: primitive  wrapper  Integer w = 100;
         *
         * unboxing: primitive  wrapper  int p = new Integer(100);
         */

        // Double d1 = 50; // doesn't compile
        Double d2 = new Double(50);
        double d3 = 50;
        Double d4 = 50.;

        List<Double> weights = new ArrayList<>();
        weights.add(50.5); // [50.5]
        weights.add(new Double(60)); // [50.5, 60.0]
        weights.remove(50.5); // [60.0]
        double first = weights.get(0); // 60.0 - this is unbox.



        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        int h = heights.get(0); // NullPointerException

        System.out.println(h);

        int j = new Integer(null); // throws NumberFormatException
    }
}
