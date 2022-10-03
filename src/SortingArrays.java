import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] a) {
      /*Massivləri sort etmək üçün Arrays.sort() metodundan istifadə edilir. Arrays java tərəfindən
təmin olunmuş birinci classdır ki, import tələb edir. Əgər import edilməzsə, hər dəfə tam
formada – java.util.Arrays – çağırmaqla da istifadə etmək olar. Əgər kod nümunələri
birinci sətirdən (line 1) başlamazsa, onda güman etməlisiniz ki, lazımı importlar artıq var.
*/
        int[] num = { 6, 9, 1 };
        Arrays.sort(num);
        for(int i = 0; i<num.length; i++)
            System.out.print(num[i] + " "); // 1 6 9

        String[] string = { "10", "9", "100" };
        Arrays.sort(string);
        for(String s: string)
            System.out.printf("%s ",s); // 10 100 9

        /*String əlifba sırası ilə sort edilir və 1 9`dan öncə gəldiyi üçün 100 9`dan öncə gəlib. String
ilə sıralamada rəqəmlər hərflərdən və böyük hərflər (uppercase) kiçik hərflərdən (lowercase)
öncə gəlir.*/


        /**Ətraflı:
         *
         http://www.coderanch.com/t/648777/ocajp/certification/Review-Multidimensional-Array*/

    }
}
