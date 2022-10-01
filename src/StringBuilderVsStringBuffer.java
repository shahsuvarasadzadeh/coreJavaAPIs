public class StringBuilderVsStringBuffer {

    /** StringBuilder StringBuffer`ə nisbətən java`ya sonradan əlavə olunub. Demək olar ki, eyni
     işi görürlər, amma StringBuffer “thread safe” olduğundan daha yavaş işləyir.
     StringBuffer imtahan mövzusuna daxil deyil, sadəcə yadınızda saxlaya bilərsiniz ki,
     StringBuilder kimi eyni metodlara malikdir. String, StringBuilder və StringBuffer hər üçü
     final classdır. Ümumiyyətlə, final classlar ilə bağlı əlavə olaraq aşağıdakıları bilməyinizdə
     fayda var:

     1. Wrapper classlar (Boolean, Integer, Long, Short, Byte, Character, Float, Double)
     final classlardır və onlardan varis almaq mümkün deyil;

     2. Number classı final class deyil və Integer, Long, Double və s. wrapper classlar Number
     classının varisidirlər (“extends” edirlər);

     3. java.lang.System classı da həmçinin final classdır.
     */
}
