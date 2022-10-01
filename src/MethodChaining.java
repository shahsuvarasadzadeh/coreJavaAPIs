public class MethodChaining {
    public static void main(String[] args) {

        /*Eyni bir String dəyişəni üçün bir neçə metodu zəncirvari şəkildə bir sətirdə çağırmaq
mümkündür:*/
        String s="AnimaL";
        s.trim().toLowerCase().replace('a','A');
        System.out.println(s); //AnimAl

    }
}
