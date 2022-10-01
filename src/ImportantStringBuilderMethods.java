public class ImportantStringBuilderMethods {
    public static void main(String[] args) {
        /**charAt(), indexOf(), length() və substring()*/

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub+" "+len+" "+ch); // anim 7 s

        /*substring() metodu geriyə StringBuilder yox String qaytarır, ona görə də sb referansının
dəyəri dəyişmir.*/

        StringBuilder b = new StringBuilder("animals");
        b.substring(b.indexOf("a"), b.indexOf("al"));
        b.append("-dog");
        System.out.println(b); // output is animals-dog, not anim-dog
        // sb.append("a").substring(0, 4).insert(2, "asdf"); // DOES NOT COMPILE

        /*Sonuncu sətir kompayl olunmur, çünki substring() metodu geriyə String qaytarır və String
classının da insert() metodu yoxdur.*/


        /** append()
         StringBuilder`ə yeni parametrlər əlavə edir və geriyə həmin obyektin referansını qaytarır.
         append() metodu 10`dan çox tipdə parametr qəbul edir. Əsas String tipli parametrlə olan
         nümunələrə baxılır.
         Quruluşu (signature):
         StringBuilder append(String str)*/

        StringBuilder c = new StringBuilder(50).append(1).append('c');
        c.append("-").append(true);
        System.out.println(c); // output: 1c-true

        // Qeyd!

        /**Quruluşu (signature):
public StringBuilder append(CharSequence s, int start, int end)*/

        String s = new StringBuilder("sb").append("0123456789", 4, 8).toString();
        System.out.println(s); // sb4567
        new StringBuilder("sb").append("0123456789",4,11); // throws IndexOutOfBoundsException


        /**insert()
         StringBuilder`də qeyd olunan indeksə yeni parametrlər əlavə edir və geriyə həmin obyektin
         referansını qaytarır.
         Quruluşu (signature):
         StringBuilder insert(int offset, String str)
         StringBuilder insert(int dstOffset, CharSequence s, int start, int end)
         */

        StringBuilder d = new StringBuilder("animals");
       d.insert(7,"-");//animals-
        d.insert(0,"-"); //-animals-
        d.insert(4,"-");//-ani-mals-
        System.out.println(d);

        String s2 = new StringBuilder("sb").insert(0, "0123456789", 4, 8).toString();
        System.out.println(s2); // 4567sb
        new StringBuilder("sb").insert(0, "0123456789", 4, 11); // throws exception


        /**delete() and deleteCharAt()

         delete() metodu insert() metodunun əksidir. Ardıcıllıqdan (sequence) simvolları silir və
         geriyə həmin obyektin referansını qaytarır. Əgər ancaq bir simvol silmək istəyiriksə, o zaman
         deleteCharAt() metodu daha uyğundur.

         Quruluşu (signature):
         StringBuilder delete(int start, int end)
         StringBuilder deleteCharAt(int index)

         */

        StringBuilder str = new StringBuilder("abcdef");
        str.delete(1, 3); // adef
        str.deleteCharAt(5); // throws StringIndexOutOfBoundsException
       // str.delete(1); // DOES NOT COMPILE
        str.delete(1, 45); // a

        /*delete() metodu aşağıdakı hallarda StringIndexOutOfBoundsException verir:
• start parametri mənfi dəyər olarsa;
• start String`in ölçüsündən (length) böyük olarsa;
• start parametri end parametrindən böyük olarsa.
deleteCharAt() metodu aşağıdakı hallarda StringIndexOutOfBoundsException verir:
• index mənfi dəyər alarsa;
• index String`in ölçüsünə (length) bərabər və ya ondan böyük olarsa.*/

        /**reverse()
         Ardıcıllıqdakı (sequence) simvolları tərsinə çevirir və geriyə həmin obyektin referansını
         qaytarır.
         Quruluşu (signature):
         StringBuilder reverse()
         */

        StringBuilder r = new StringBuilder("Ismayil");
        r.reverse();
        System.out.println(r); // liyamsI

        /** toString()
         StringBuilder`i String`ə çevirir.
         Quruluşu (signature):
         String toString()
         */

        String st = r.toString();


        /** setLength()
         StringBuilder`ə yeni uzunluq vermək üçün istifadə edilir.
         Quruluşu (signature):
         public void setLength(int newLength)
         Əgər newLength cari uzunluqdan kiçik olarsa, o zaman newLength StringBuilder`in yeni
         uzunluğu olur və geriyə qalan digər simvollar atılır. Yox əgər newLength cari uzunluqdan
         böyük və ya bərabər olarsa, newLength yenə də yeni uzunluq olur və çatışmayan simvolların
         yeri '\u0000' simvolu ilə doldurulur. setLength() metodu mənfi parametr qəbul edə bilməz.
         */

        StringBuilder t = new StringBuilder("12345678");
        System.out.println(t + ", " + t.length()); // 12345678, 8
        t.setLength(5);
        System.out.println(t + ", " + t.length()); // 12345, 5
        t.setLength(10);
        System.out.println(t + ", " + t.length()); // 12345 , 10
        t.setLength(-5); // throws StringIndexOutOfBoundsException





    }
}
