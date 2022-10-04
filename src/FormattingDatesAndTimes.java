import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormattingDatesAndTimes {
    public static void main(String[] args) {
        /*Hər hansı tarix və ya vaxtdan müəyyən məlumatların əldə edilməsi üçün bir sıra metodlar
mövcuddur:*/

        LocalDate date = LocalDate.now(); // 2015-08-14
        System.out.printf("%s, %s, %d, %d%n",
                date.getDayOfWeek(), /* FRIDAY */
                date.getMonth(), /* AUGUST */
                date.getYear(), /* 2015 */
                date.getDayOfYear() ); /* 226 */

        /*Tarix və ya vaxt ilə bağlı məlumatları istədiyin formatda görüntüləyə bilmək üçün
java.time.format paketində mövcud olan DateTimeFormatter classından istifadə olunur.
Standart ISO forması aşağıdakı kimidir:*/

        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20); //2020-01-20
        LocalTime time = LocalTime.of(11, 12, 34);//11:12:34
        LocalDateTime dateTime = LocalDateTime.of(date1, time); // 2020-01-20T11:12:34
        System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
// date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // throws Exception



    }
}
