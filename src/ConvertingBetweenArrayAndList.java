
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingBetweenArrayAndList {
    public static void main(String[] args) {
        /*ArrayList`in massivə çevrilməsi üçün List interfeysinin toArray() metodundan istifadə
edilir:*/

        List<String> list = new ArrayList<>();
        list.add("element1");
        list.add("element2");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length); // 2

        /**
         * toArray() metodu geriyə Object tipli massiv qaytarır, ona görə də default olaraq yaranan
         * massivin tipi Object tipidir. Əgər massivin tipini xüsusi olaraq təyin etmək istəyiriksə, o
         * zaman 8-ci sətirdəki kimi həmin tipi toArray() metoduna parametr olaraq göndəririk. new
         * String[0] belə yazdıqda 0-a görə mənimsədilən listin öz ölçüsünü massivə verir. Ancaq 0-ın
         * əvəzinə yazılan rəqəm əgər mənimsədilən listin ölçüsündən kiçik olarsa o zaman listin ölçüsü
         * massivin ölçüsü olur, əgər böyük olarsa qalan elementlərin yeri null ilə doldurulur.
         * */

        // String[] stringArray1 = list.toArray(); // DOES NOT COMPILE
        String[] stringArray2 = list.toArray(new String[4]);
        System.out.println(Arrays.toString(stringArray2)); // [element1,element2,null,null]

        //Əgər massivin ölçüsü qeyd olunmasa kompayl xətası verəcək:
       // String[] stringArray = list.toArray(new String[]); // DOES NOT COMPILE



        /**
         * Massivi listə çevirmək üçün Arrays classının asList() metodundan istifadə edilir. Orijinal
         * massiv ilə bu massiv əsasında yaradılmış list bir-biri ilə əlaqəli olur. Yəni bunlardan birinin
         * elementlərinin dəyişilməsi hər ikisinə təsir göstərir, çünki eyni yaddaş sahəsinə müraciət
         * edirlər (point to the same data store). Bu qayda ilə yaradılmış list həm də fixed-size list hesab
         * olunur, ölçüsünün dəyişdirilməsinə icazə verilmir.*/

        System.out.println("------------------------------------");
        String[] array = {"element1", "element2"}; // [element1, element2]
        List<String> list1 = Arrays.asList(array); // returns fixed size list
        System.out.println(list1.size()); // 2
       // ArrayList<String> list3 = Arrays.asList(array); // doesn't compile
        list1.set(1, "test"); // [element1, test]
        array[0] = "new"; // [new, test]
        for(String b: array)
            System.out.print(b+" "); // new test

        list1.remove(1); // throws UnsupportOperationException
        System.out.println(list1);

     //   ArrayList<String> list3 = Arrays.asList(array); // doesn't compile

    }
}
