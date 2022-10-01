public class MutabilityAndChaining {
    public static void main(String[] args) {
        /*Biz String metodlarını zəncirvari şəkildə çağırdıqda (chaining) nəticə olaraq geriyə yeni
String qaytarır. Amma StringBuilder chaining olunan referansın öz dəyərini dəyişir və
geriyə həmin referansı qaytarır, yəni yeni StringBuilder obyekti yaradılmır:*/

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append('g');
        System.out.println("a = "+a); // abcdefg
        System.out.println("b = "+b); // abcdefg

        /*Burada cəmi bir StringBuilder obyekti var, a və b referansları hər ikisi eyni obyektə işarə
edirlər (refer).*/
    }
}
