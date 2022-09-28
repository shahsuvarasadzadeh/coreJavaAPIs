public class Immutability {
/*String immutable dəyişəndir, yəni String obyekti bir dəfə yaradıldısa, sonradan
dəyişdirilməyinə icazə verilmir, genişlənə və kiçilə bilməz. Həmçinin Java`da immutable
classlar final`dır.*/
public static void main(String[] args) {
    String s1 = "1";
    String s2 = s1.concat("2");
    s2.concat("3");
    System.out.println(s2); // 12

    /**String pool(intern pool) – bütün stringləri toplamaq üçün JVM`də ayrılmış yerdir. String pool
özündə ancaq literal dəyərləri tutur (contain). */
}
}
