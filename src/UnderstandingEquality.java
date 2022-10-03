import java.util.ArrayList;

public class UnderstandingEquality {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder("java");
        StringBuilder two = new StringBuilder("java");

        StringBuilder three = one.append(two);
        System.out.println(three);
        System.out.println(one==three);
        System.out.println(one.equals(three)); // true
        System.out.printf("%s, %s, %s%n", one, two, three); // javajava, java, javajava

//        String ilə bağlı nümunə:

        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true
        System.out.println(x.equals(y)); // true
        String z = " Hello World".trim();
        System.out.println(x == z); // false
        System.out.println(x.equals(z)); // true

        /*String immutable`dır və String literal dəyərləri String Pool'da saxlanılır. JVM yaddaşda eyni
literaldan ancaq bir ədəd yaradır. Yuxarıdakı nümunədə "Hello World" bir dəfə yaradılır və
pool`da saxlanılır. x və y referanslarının hər ikisi də həmin o obyektə işarə edir.
" Hello World".trim(); literal dəyər olmadığından pool`da saxlanılmır, ona görə də x və z
eyni obyektə işarə etmirlər, amma eyni dəyərə malikdirlər. Burada da incə bir məqam var,
aşağıdakı kod nümunəsinə baxaq:*/

        String s = "Hello World";
        String st = "Hello World".trim();
        String str = "Hello World".toString();
        System.out.println(s == st); // true
        System.out.println(s == str); // true

        /**http://www.coderanch.com/t/652234/ocajp/certification/Understanding-Equality-pageJava-OCA*/

        // String metodlar üzərindən bəzi əlavə nümunələrə baxaq:

        String s1 = "test";
        String s2 = s1.substring(0);
        String s3 = s1.replace("e","e");
        String s3_ = s1.replace('e','e'); //P.S. replace() char parametr ilə olanda true qaytarır.
        String s4 = "test".trim();
        String s5 = "test ".trim();
        String s6 = s1.toString();
        System.out.printf("substring: %s==%s returns %b%n", s1, s2, s1==s2);
        System.out.printf("replace1: %s==%s returns %b%n", s1, s3, s1==s3);
        System.out.printf("replace2: %s==%s returns %b%n", s1, s3_, s1==s3_);
        System.out.printf("trim1: %s==%s returns %b%n", s1, s4, s1==s4);
        System.out.printf("trim2: %s==%s returns %b%n", s1, s5, s1==s5);
        System.out.printf("toString: %s==%s returns %b%n", s1, s6, s1==s6);


        /*ütün wrapper classların equals() metodunun
gövdəsində ilk olaraq müqayisə edilən obyektlərin eyni classa aid olub olmadığı yoxlanılır.
Əgər eyni classa aid deyilsə, o zaman dəyərlərin yoxlanılması aparılmır, birbaşa false
qaytarılır. */


       /*Wrapper classlar ilə bağlı digər maraqlı bir nümunəyə Coderanch forumunda rast gələ
bilərsiniz:*/

        int myInt1 = 10;
        Integer myInteger1 = 10;
        Integer myInteger2 = 10;
        Integer myInteger3 = new Integer(10);
        Short myShort1 = 10;
        Number myNumber1 = 10;
        Double myDouble1 = 10.0;
       // Double myDouble2 = 10; // DOES NOT COMPILE
        System.out.println(myInt1 == myInteger1); // true
        System.out.println(myInt1 == myInteger3); // true
        System.out.println(myInt1 == myShort1); // true
     //   System.out.println(myInt1 == myNumber1); // DOES NOT COMPILE
        System.out.println(myInt1 == myDouble1); // true
        System.out.println(myInteger1 == myInteger2); // true
        System.out.println(myInteger1 == myInteger3); // false
     //   System.out.println(myInteger1 == myShort1); // DOES NOT COMPILE
        System.out.println(myInteger1 == myNumber1); // true
     //   System.out.println(myInteger1 == myDouble1); // DOES NOT COMPILE
        System.out.println(myShort1 == 10.0); // true
        System.out.println(myShort1 == myNumber1); // false
      //  System.out.println(myShort1 == myDouble1); // DOES NOT COMPILE


        //Ətraflı:

        /*** http://www.coderanch.com/t/643974/ocajp/certification/operator-wrapper-classes */


      //  Əlavə olaraq aşağıdakı nümunələrə baxmağınızda da fayda var:

        String st1 = new String();
        String st2 = new String();
        System.out.println(st1.equals(st2)); //true, çünki equals metodunu implement edir
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb1.equals(sb2)); //false, çünki equals metodunu implement etmir
        ArrayList l1 = new ArrayList();
        ArrayList l2 = new ArrayList();
        System.out.println(l1.equals(l2)); //true, çünki equals metodunu implement edir
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.equals(o2)); // false
        String str1 = "one";
        String str2 = "two";
        System.out.println(str1.equals(str1 = str2)); // false
        System.out.println(str1.equals(str2 = str1)); // true
        String d1 = "s1";
        String d = "s";
        System.out.println(d1 == d + 1); // false
        System.out.println(d1 == "s" + 1); // true
        final String e1 = "e1";
        final String e = "e";
        System.out.println(e1 == e + 1); // true
        String z1 = "java";
        StringBuilder z2 = new StringBuilder("java");
       // if(z1 == z2) // DOES NOT COMPILE
        //    System.out.println("1");
        if(z1.equals(z2)) // false
            System.out.println("2");
        String a = "";
        String b = "2cfalse";
        a += 2;
        a += 'c';
        a += false;
        System.out.println(a == "2cfalse"); // false
        System.out.println(a.equals("2cfalse")); // true
        System.out.println(b == "2cfalse"); // true




    }
}
