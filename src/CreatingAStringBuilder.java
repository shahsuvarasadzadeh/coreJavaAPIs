public class CreatingAStringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);
        StringBuilder sb4 = new StringBuilder(-5); // throws NegativeArraySizeException

        /*sb3 referansında 10 capacity`ni göstərir, length`ı deyil. Capacity obyektin özündə nə qədər
simvol tutub saxlaya biləcəyini göstərir. String immutable olduğundan onun üçün length və
capacity eynidir. Amma StringBuilder`ə yeni simvollar əlavə olunduqca capacity avtomatik
olaraq genişlənir. StringBuilder yaradılarkən capacity təyin edilməyibsə, default olaraq
16`dan başlayır.*/

        System.out.println(sb3.length()); // output: 0
        System.out.println(sb3.capacity()); // output: 10\

        /*Capacity`ni artırmaq üçün ensureCapacity(int minimumCapacity) metodundan istifadə
edilir. Göndərilən parametrdən asılı olaraq fərqli nəticələr meydana çıxır:

1) əgər minimumCapacity mənfi olarsa, heç bir dəyişiklik baş vermir və currentCapacity
yerində qalır (default olaraq 16);
2) əgər currentCapacity > minimumCapacity olarsa, heç bir dəyişiklik baş vermir və
currentCapacity yerində qalır;
3) əgər currentCapacity < minimumCapacity olarsa, yeni capacity yaradılır:
a) minimumCapacity < currentCapacity*2+2 olarsa, yeni capacity
currentCapacity*2+2 olacaq;
b) minimumCapacity > currentCapacity*2+2 olarsa, yeni capacity minimumCapacity
olacaq.
*/

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // 16
        sb.ensureCapacity(-10); // 16
        sb.ensureCapacity(10); // 16
        sb.ensureCapacity(20); // 34
        sb.ensureCapacity(71); // 71

    }
}
