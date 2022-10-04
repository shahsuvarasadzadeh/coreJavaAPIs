import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        /*Massivləri sort etmək üçün java.util paketinin Arrays.sort() metodundan istifadə edirdik,
ArrayList`i sort etmək üçün isə həmin paketin Collections.sort() metodu istifadə edilir. */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        java.util.Collections.sort(numbers);
        System.out.println(numbers); // [5, 81, 99]


        /*Sıralamada rəqəmlər həmişə hərflərdən, həmçinin böyük hərflər də kiçik hərflərdən əvvəl
gəlir, və String dəyişənin sıralaması əlifba sırasına uyğun aparılır, ona görə də 30 8`dən öncə
gəlir.*/

        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        System.out.println(hex); // 30 3A 8 FF
        int k = Collections.binarySearch(hex, "8");
        int m = Collections.binarySearch(hex, "3A");
        int n = Collections.binarySearch(hex, "4F");
        System.out.printf("%d %d %d%n", k, m, n); // 2 1 -3

        List<String> hex1 = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex1);
        System.out.println(hex1); // 30 3A 8 FF
        int a = Collections.binarySearch(hex1, "8");
        int b = Collections.binarySearch(hex1, "3A");
        int c = Collections.binarySearch(hex1, "4F");
        System.out.printf("%d %d %d%n", k, m, n); // 2 1 -3



    }
}
