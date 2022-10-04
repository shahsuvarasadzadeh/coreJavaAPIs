import java.time.*;

public class WorkingWithPeriods {
    public static void main(String[] args) {

        //Period yaratmağın 5 yolu var:

        Period annually = Period.ofYears(1); // every 1 year
        Period quarterly = Period.ofMonths(3); // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        Period everyOtherDay = Period.ofDays(2); // every 2 days
        Period everyYearAndWeek = Period.of(1, 0, 7); // every year and 7 days

       /* Burada bir istisna var. Date və time classlarından fərqli olaraq Period classı üçün biz zəncirvari
        metodlardan istifadə edə bilmərik:*/

        Period wrong = Period.ofYears(1).ofWeeks(1); // P7D - every week
        System.out.println(wrong);

        /*Biz fikirləşə bilərik ki, wrong`un nəticəsi yuxarıda qeyd etdiyimiz everyYearAndWeek`in
nəticəsi ilə eyni olacaq, amma elə deyil. Period.ofXXX metodları static olduğundan
zəncirvari şəkildə işlədildikdə ancaq sonuncu metodun nəticəsi götürülür. Aşağıdakı şəkildə
yazıldıqda belə yenə nəticə “every week” olur, imtahanda çaşdırmaq üçün bu cür yazılışdan
istifadə oluna bilər:*/

        wrong = Period.ofYears(1);
        wrong = Period.ofWeeks(1); // P7D - every week

        /**Amma of() metodu vasitəsilə biz bir perioda həm il, həm ay və həm də gün göndərə bilərik.
         Signature:
         public static Period of(int years, int months, int days) */


        /*Period adətən bir gün və ondan böyük müddətlər üçün istifadə olunur. Daha qısa müddətlər
(saat, dəqiqə, saniyə və s.) üçün isə Duration istifadə olunur. Duration`un da işləmə prinsipi
Period ilə təxminən eynidir, lakin Duration adətən imtahanda düşmür.*/

        Duration duration = Duration.ofSeconds(10); // PT10S


        /*Periodla bağlı sonuncu diqqət etməli olduğumuz məqam periodun hansı obyektlərlə işlənib
işlənə bilməməsinə diqqət etməkdir.*/

        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period)); // 2015-02-20
        System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
        System.out.println(time.plus(period)); // UnsupportedTemporalTypeException
        Duration duration1 = Duration.ofSeconds(10);
        System.out.println(time.plus(duration)); // 06:15:10


    }
}
