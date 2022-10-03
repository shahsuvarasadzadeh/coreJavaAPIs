import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        /*ArrayList toString() metodunu
“implement” edir, ona görə də massivlərdən fərqli olaraq listləri toString() metodundan
istifadə etməklə print edib normal görünüşdə baxa bilərik.*/

        ArrayList<String> cars = new ArrayList<>();
        cars.add("bmw");
        //cars.add(Boolean.TRUE); //does not compile

        /*Generic tipi String olduğundan başqa tipdə dəyişən qəbul etmir.
         Amma generic ilə non-generic`i mix edəndə kompayl səhvi vermir, sadəcə xəbərdarlıq (warning) verir.*/

        ArrayList cars1 = new ArrayList<String>();
        cars1.add("bmw");
        cars1.add(Boolean.TRUE);

        // Başqa nümunəyə baxaq:
        List<String> cars2 = new ArrayList();
        cars2.add("bmw"); // [bmw]
        cars2.add(1, "mercedes"); // [bmw, mercedes]
        cars2.add(0, "kia motors"); // [kia motors, bmw, mercedes]
        cars2.add(1, "toyota"); // [kia motors, toyota, bmw, mercedes]
        System.out.println(cars2); // [kia motors, toyota, bmw, mercedes]

        /*Əgər hansısa indeksə yeni element əlavə etmək istəyirsinizsə, o zaman əlavə etmək istədiyiniz
indeksin maksimum nömrəsi listin ölçüsünə (size) bərabər olmalıdır, əks halda
IndexOutOfBoundsException verəcək. Yəni əlavə etmək istədiyiniz indeksdən əvvəlki indeksdə
mütləq element olmalıdır. */

        cars.add(5, "moskvich"); // throws IndexOutOfBoundsException


        /**remove()
         Quruluşu (signature):
         boolean remove(Object object)
         E remove(int index)*/

        /*Birinci metod ArrayList`də göndərilən object`ə uyğun gələn birinci elementi silir və nəticə
olaraq geriyə true qaytarır. Yox əgər həmin element listdə mövcud deyilsə, geriyə false
qaytarır.
İkinci metod göndərilən indeksdə olan elementi silir və geriyə sildiyi indeksdə mövcud olan
elementi qaytarır. Əgər həmin indeks listin ölçüsündən böyük olarsa exception baş verir.*/

        List<String> cars6 = new ArrayList();
        cars6.add("bmw"); // [bmw]
        cars6.add("mercedes"); // [bmw, mercedes]
        cars6.add("bmw"); // [bmw, mercedes, bmw]
        System.out.println(cars6.remove("toyota")); // false
        System.out.println(cars6.remove("bmw")); // true
        System.out.println(cars6.remove(0)); // mercedes
        System.out.println(cars6); // [bmw]

        /*Bu metod ilə bağlı ən çaşdırıcı nümunələr adətən aşağıdakı formada olur. Sizcə nə çap
olunacaq?*/

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.remove(1);
        System.out.println(list);

        /*Göründüyü kimi listə 1 və 2 rəqəmləri əlavə edilir və sonra remove metodu çağırılır. Bu
proseslərdən sonra ağıla ilk gələn fikir o olur ki, 1 silinir və 2 qalır. Son olaraq da 2 çap olunur.
Amma əslində elə deyil. remove() overload metod olduğundan, overload qaydalarına görə (bu
barədə chapter 4’də məlumat veriləcək) “signature”də göstərilən 2-ci metod çağırılır. Ona
görə də bu nümunədəki remove metodu elementin dəyərini deyil, onun indeksini göstərir. Bu
səbəbdən 1-ci indeksdəki element (2) silinir. Əgər 1 dəyərinin silinməsini istəyiriksə, o zaman
remove metodunu aşağıdakı formada yazmalıyıq:*/

        list.remove(new Integer(1));


        /**set()
         Quruluşu (signature):
         E set(int index, E newElement)*/

        /*Bu metod ArrayList`in qeyd olunmuş indeksdəki elementini newElement ilə əvəz edir və
geriyə əvəz edilmiş yeni elementi qaytarır. Bu zaman listin ölçüsü dəyişilmir.*/

        List<String> cars7 = new ArrayList();
        cars7.add("ford"); // [ford]
        System.out.println(cars.size()); // 1
        cars7.set(0, "honda"); // [honda]
        System.out.println(cars.size()); // 1
        cars7.set(1, "lada"); // throws IndexOutOfBoundsException


        /**isEmpty() and size()
         Quruluşu (signature):
         boolean isEmpty()
         int size()*/

        List<String> cars8 = new ArrayList();
        System.out.println(cars8.isEmpty()); // true
        System.out.println(cars8.size()); // 0
        cars8.add("nissan");
        cars8.add("ferrari");
        System.out.println(cars8.isEmpty()); // false
        System.out.println(cars8.size()); // 2

       /** clear()
        Quruluşu (signature):
        void clear()*/

      // Nümunə:

        ArrayList<String> cars9 = new ArrayList<>();
        cars9.add("infiniti"); // [infiniti]
        cars9.add("mazda"); // [infiniti, mazda]
        cars9.clear(); // []

        /**contains()
         Quruluşu (signature):
         boolean contains(Object object)*/

        ArrayList<String> car = new ArrayList<>();
        car.add("kamaz"); // [kamaz]
        System.out.println(car.contains("kamaz")); // true
        System.out.println(car.contains("maz")); // false

        /*Bu metod uyğunluq olub olmadığını yoxladığına görə hər element üçün equals() metodunu
çağırır. */


        /**equals()
         Quruluşu (signature):
         boolean equals(Object object)
         ArrayList equals() metodunu implement/override edir, ona görə də iki listdə eyni
         elementlərin eyni ardıcıllıqda gəlib gəlmədiyini müqayisə etmək olar.*/

        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two)); // true
        one.add("a"); // [a]
        System.out.println(one.equals(two)); // false
        two.add("a"); // [a]
        System.out.println(one.equals(two)); // true
        one.add("b"); // [a, b]
        two.add(0,"b"); // [b, a]
        System.out.println(one.equals(two)); // false, ardıcıllıq fərqli olduğuna görə


        /**sublist()
         Quruluşu (signature):
         List<E> subList(int fromIndex, int toIndex)
         Geriyə yeni list qaytarır. fromIndex daxildir, toIndex daxil deyil.*/

        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add(1, "c");
        List s2 = new ArrayList(s1.subList(1, 2));
        s1.addAll(s2);
        System.out.println(s1); // [a, c, b, c]





    }
}
