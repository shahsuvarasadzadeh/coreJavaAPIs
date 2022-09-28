public class ImportantStringMethods {
    // Java`da indekslər sıfırdan başlayaraq sayılır.
    public static void main(String[] args) {

        String animals = "animals"; // Nümunələr bu dəyişən üzərindən aparılacaqdır:


        System.out.println(animals.length()); // 7 - uzunlugu

        System.out.println(animals.charAt(0)); // a - Axtarılan indeksdə olan simvolu (character) geri qaytarır.
        System.out.println(animals.charAt(7)); // throw StringIndexOutOfBoundsException
        // Dokumentasiyaya (javadoc) əsasən isə IndexOutOfBoundsException fırladır.

         /*charAt() metodu geriyə char dəyər qaytardığından onu String`ə mənimsətmək mümkün
        deyil:*/

        String str = "str";
        // String s = str.charAt(0); // incompatible types: char cannot be converted to String


        /**indexOf()
         Hər hansı bir simvolun (character) və ya ifadənin verilmiş stringin daxilində olub olmadığını
         axtarır və nəticə müsbət olarsa, axtarılan ifadənin ilk tapıldığı indeksi geri qaytarır. Axtarışa
         istənilən indeksdən başlamaq olar.*/

        System.out.println(animals.indexOf('a')); // 0
        System.out.println(animals.indexOf("al")); // 4
        System.out.println(animals.indexOf("al", 5)); // -1

        /*charAt() metodundan fərqli olaraq indexOf() metodu axtarılan dəyəri tapmadıqda exception
fırlatmır, -1 dəyərini geri qaytarır.*/


        /**substring()
         Quruluşu (signature):
         String substring(int beginIndex)
         String substring(int beginIndex, int endIndex)*/

        System.out.println(animals.substring(3)); //mals
        System.out.println(animals.substring(animals.indexOf('m'))); //mals
        System.out.println(animals.substring(3, 4)); //m
        System.out.println(animals.substring(3, 7)); //mals
        System.out.println(animals.substring(3, 3)); //empty string
        System.out.println(animals.substring(3, 2)); //throws StringIndexOutOfBoundsException
        System.out.println(animals.substring(3, 8)); //throws StringIndexOutOfBoundsException
        System.out.println(animals.substring(7)); //empty string

        /*beginIndex qayıdan nəticəyə daxildir, amma endIndex daxil deyil. Sonuncu nümunəyə diqqət
edək, 7-ci indeks mövcud olmamasına baxmayaraq exception baş vermədi. Əgər bu
nümunədə (length-beginIndex) mənfi olmazsa, exception baş vermir, sıfıra bərabər olarsa,
boş string qaytarır.*/

        /**toLowerCase() and toUpperCase()
         Quruluşu (signature):
         String toLowerCase()
         String toUpperCase()*/

        System.out.println(animals.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123


        /**equals() and equalsIgnoreCase()
         Quruluşu (signature):
         boolean equals(Object str)
         boolean equalsIgnoreCase(String str)*/

        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true
        Object o1 = "str";
        Object o2 = "Str";
        System.out.println(o1.equals(o2)); // false
       // System.out.println(o1.equalsIgnoreCase(o2)); //DOES NOT COMPILE, only String..
        System.out.println(((String)o1).equalsIgnoreCase((String)o2)); // true


        /**startsWith() and endsWith()
         Quruluşu (signature):
         boolean startsWith(String prefix)
         boolean endsWith(String suffix)*/

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        /**contains()
         Quruluşu (signature):
         boolean contains(CharSequence s)*/

        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        // Bu metod çıxdıqdan sonra artıq indexOf() metodu ilə şərt yoxlamağa ehtiyac qalmadı.


        /**replace()
         Quruluşu (signature):
         String replace(char oldChar, char newChar)
         String replace(CharSequence oldChar, CharSequence newChar)*/

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc
        System.out.println("abcabc".replace("ab", "AB")); // ABcABc
        System.out.println("abcabc".replace("d", "D")); // abcabc, no exception
        StringBuilder sb = new StringBuilder("bc");
        System.out.println("abcabc".replace(sb, "BC")); // aBCaB

/*1. replace() metodu yeni String obyekti yaradır;
2. əgər replace() metoduna göndərilən hər iki parametr eynidirsə, yəni heç bir
dəyişiklik baş verməyəcəksə, eyni String obyekti geri qaytarılır.*/

        System.out.println("String".replace('g','g') == "String"); // true
       // "String".replace('g','g') == "String".replace('S','S')// true
       // "String".replace('S','s') == "String".replace('S','s') // false
       // "String".replace('g','G') == "StrinG" // false

        /**trim()
         String`in əvvəlindəki və sonundakı boşluqları, həmçinin \t (tab), \n (newline) və \r (carriage
         return) simvollarını da silir. Amma ortadakı boşluqlara toxunmur.
         Quruluşu (signature):
         String trim()*/

        System.out.println("abc".trim()); // abc
        System.out.println("abc\r !".trim()); // !
        System.out.println("\t a b c \n".trim()); // a b c



    }
}
