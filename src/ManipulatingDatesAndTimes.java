import java.time.*;

public class ManipulatingDatesAndTimes {
    public static void main(String[] args) {
        /*Date və time classları String kimi immutable`dir. Ona görə də edilmiş hər hansı bir
dəyişikliyin yadda saxlanılmasını istəyiriksə, həmin dəyişikliyin nəticəsini yenidən referans
dəyişənə mənimsətmək lazımdır.*/

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014-01-20
        date = date.plusDays(2);
        System.out.println(date); // 2014-01-22
        date = date.plusWeeks(1);
        System.out.println(date); // 2014-01-29
        date = date.plusMonths(1);
        System.out.println(date); // 2014-02-28
        date = date.plusYears(5);
        System.out.println(date); // 2019-02-28
        date = date.minusMonths(1);
        System.out.println(date); // 2019-01-28
        date = date.plusMonths(1).plusDays(2);
        System.out.println(date); // 2019-03-02

        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date1, time);
        System.out.println(dateTime); // 2020-01-20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2020-01-19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020-01-18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020-01-18T19:14:30

        // İmtahanda sizi əsas 2 yolla çaşdıra bilərlər:

        /**
         * 1. Date və time classlarının immutable olduğunu yaddan çıxarmayın!
         */
        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        date2.plusDays(10);
        System.out.println(date2); // 2020-01-20

        /**
         * 2. LocalDate saat ilə bağlı, LocalTime isə tarix ilə bağlı metodları dəstəkləmir!
         */


        LocalDate date3 = LocalDate.of(2017, Month.OCTOBER, 20);
        date3 = date3.plusDays(3);
        date3.plusMonths(-1); // It is the same date.minusMonths(1);
       // date3.plusHours(11); // DOES NOT COMPILE
    }
}
