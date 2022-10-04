public class NoteBoolean {

    /*1. Boolean classının 2 konstruktoru var - Boolean(String ) və Boolean(boolean ). Əgər String
parametri null deyilsə və dəyəri “true” (və ya “True” yaxud “tRuE”, yəni böyük-kiçik hərf
duyarlı deyil) olarsa, o zaman geriyə dəyər true olan Boolean obyekti qaytarılır. Əks halda
false qaytarır.

2. Boolean classının boolean dəyər yaratmaq üçün 2 köməkçi static metodu var -
parseBoolean and valueOf.
Boolean.parseBoolean(String ) metodu geriyə obyekt deyil, primitiv tip qaytarır. Yuxarıda
qeyd etdiyimiz qayda bunun üçün də keçərlidir, yəni null deyilsə və dəyəri “true” olarsa, o
zaman geriyə true qaytarır.
valueOf metodu overload metoddur, həm String, həm də boolean tipində parametr qəbul
edir. İşləmə qaydası parseBoolean ilə eynidir, amma ondan fərqli olaraq geriyə referans tip
qaytarır, amma yeni obyekt yaratmır.



3. == operatoru ilə 2 boolean dəyəri müqayisə etdikdə, əgər tərəflərdən biri Boolean wrapper
class olarsa, o zaman o “unboxed” vasitəsilə primitiv tipə çevirilir və sonra müqayisə aparılır.
Yox əgər hər iki tərəf wrapper classdırsa, o zaman onların referansları müqayisə olunur.
*/
    public static void main(String[] args) {

        System.out.println(new Boolean("true ")); // false
        System.out.println(new Boolean("tRUe")); // true
      //  new Boolean("true") == new Boolean("true") // false
       // new Boolean("true") == Boolean.valueOf("true") // false
        //new Boolean("true") == Boolean.valueOf(true) // false
        //new Boolean("true") == Boolean.parseBoolean("true") // true
        //new Boolean(null) == Boolean.parseBoolean(" true ") // true
     //   new Boolean("true") == Boolean.parseBoolean(true) // does not compile
        //Boolean.valueOf("true") == Boolean.TRUE // true
        //new Boolean("true") == Boolean.TRUE // false
       // Boolean.valueOf("truE") == Boolean.parseBoolean("True")// true


        /*Fərqli Wrapper classlara aid referansları == operatoru ilə müqayisə etmək mümkün deyil,
kompayl xətası verəcək:*/

        Short k = 9;
        Integer w = 9;
       // System.out.println(k == w); // does not compile

        short s = 9;
        int i = 9;
        System.out.println(s == i); // true
    }

}
