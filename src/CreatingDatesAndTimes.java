import java.time.*;

public class CreatingDatesAndTimes {
    /**
     * LocalDate – saat və saat qurşağı (time zone) daxil deyil, ancaq tarixi göstərir. Nümunə üçün
     * sizin ad günü tarixiniz buna misal ola bilər.
     *
     * LocalTime – tarix və saat qurşağı daxil deyil, ancaq vaxtı/saatı göstərir.
     *
     * LocalDateTime – həm tarixi, həm də saatı göstərir, lakin saat qurşağı daxil deyil.*/

    public static void main(String[] args) {

        /*Oracle ehtiyac olmadıqca saat qurşağından istifadə etməməyi məsləhət görür. Cari tarix və ya
vaxtı öyrənmək üçün hər üç classın static now() metodundan istifadə edilir.*/

        System.out.println(LocalDate.now()); // 2015-08-12
        System.out.println(LocalTime.now()); // 12:40:37.095
        System.out.println(LocalDateTime.now()); // 2015-08-12T12:40:37.095

        /*LocalDateTime`ı String`ə çevirən zaman tarix və saatı bir-birindən ayırmaq üçün java T
simvolu istifadə edir. Bir də yadda saxlamaq lazımdır ki, tarix formatında ay həmişə gündən
əvvəl gəlir.*/



        /**
         * Hər hansı bir spesifik tarix və ya vaxt yaratmaq istəyiriksə, of() metodundan istifadə edirik.
         * LocalDate of() method signature:
         * public static LocalDate of(int year, Month month, int dayOfMonth)
         * public static LocalDate of(int year, int month, int dayOfMonth)*/

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 10); // 2015-01-10
        LocalDate date2 = LocalDate.of(2015, 1, 10); // 2015-01-10

        /*of() metoduna 2-ci parametr olaraq həm enum, həm də int tipində dəyişən göndərmək
mümkündür. int tipində parametr göndərərkən diqqət etmək lazımdır ki, say 0-dan deyil 1-
dən başlamalıdır.
*/

        /**
         * LocalTime of() method signature:
         * public static LocalTime of(int hour, int minute)
         * public static LocalTime of(int hour, int minute, int second)
         * public static LocalTime of(int hour, int minute, int second, int nanoOfSecond)*/

        LocalTime time1 = LocalTime.of(6, 15); // 06:15
        LocalTime time2 = LocalTime.of(6, 15, 30); // 06:15:30
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // 06:15:30.000000200



        /**
         * LocalDateTime of() method signature:
         * public static LocalDateTime of(int year, Month month, int day, int hour, int min)
         * public static LocalDateTime of(int year, Month month, int day, int hour, int min, int
         * sec)
         * public static LocalDateTime of(int y, Month m, int day, int hour, int min, int sec, int
         * nanos)
         * public static LocalDateTime of(int year, int month, int day, int hour, int minute)
         * public static LocalDateTime of(int year, int month, int day, int hour, int min, int sec)
         * public static LocalDateTime of(int year, int m, int day, int hour, int min, int sec, int
         * nanos)
         * public static LocalDateTime of(LocalDate date, LocalTime time)*/

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 10, 6, 15);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);



       /* LocalDate, LocalTime və LocalDateTime classlarının konstruktoru private olduğundan new
                açar sözü ilə birbaşa obyektini yaratmaq mümkün deyil:*/

       // LocalDate d = new LocalDate(); // does NOT compile


        /*Digər çaşdırıcı məqam isə of() metoduna parametr kimi doğru olmayan dəyərlərin
göndərilməsidir:*/

        LocalDate.of(2015, Month.JANUARY, 32); // DateTimeException: Invalid value for DayOfMonth
        // (valid values 1 - 28/31): 32





    }
}
