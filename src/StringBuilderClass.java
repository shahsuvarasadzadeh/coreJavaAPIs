public class StringBuilderClass {
    public static void main(String[] args) {

        //Nümunə 1:
        String s = "";
        for(char current='a'; current <= 'z'; current++)
            s += current;
        System.out.println(s);
        //Nümunə 2:
        StringBuilder sb = new StringBuilder();
        for(char current='a'; current <= 'z'; current++)
            sb.append(current);
        System.out.println(sb);

        /*Nümunə 1 və Nümunə 2 mahiyyət baxımından ikisi də demək olar ki, eyni işi görür. Amma
fərq ondadır ki, String dəyişəni immutable dəyişəndir və ona görə də 1-ci nümunədə hər dəfə
concatenation əməliyyatı yerinə yetirildikdə yeni dəyər yaradılır və köhnə dəyər artıq garbage
collection üçün “eligible” obyekt hesab olunur (təxminən 27 obyekt yaradılır və əksəri eligible
olur).
StringBuilder mutable`dir və ona görə də ikinci nümunədə cəmi bir obyekt yaradılır, hər
append() metodundan sonra sadəcə dəyəri dəyişir.*/

        // String dəyərini StringBuilder`ə mənimsətmək olmaz:
        // StringBuilder b = "StringBuilder"; // DOES NOT COMPILE
    }
}
