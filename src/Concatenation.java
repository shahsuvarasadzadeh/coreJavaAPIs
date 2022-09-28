public class Concatenation {
    /*Yadda saxlanılmalı qaydalar:
1. Əgər hər iki dəyişən (operand) numeric olarsa, + toplama əməliyyatını nəzərdə tutur.
2. Əgər dəyişənlərdən biri String olarsa, + concatenation əməliyyatını nəzərdə tutur.
3. İfadə soldan sağa doğru hesablanır.*/
    public static void main(String[] args) {
        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println(1 + 2 + "c" + 1 + 2); // 3c12
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 64

        String s = "1";
        s += "2";
        s += 3;
        System.out.println(s); // 123

        StringBuilder sb = new StringBuilder("Hello ");
        String str = "java!";
        String welcome = sb + str;
        System.out.println(welcome); // Hello java!

        /*Əgər + operatorunun sağ və ya sol tərəfindəki dəyərlərdən biri String tipindədirsə, icra vaxtı
digər dəyər də String`ə çevrilir. Aşağıdakı nümunəyə baxaq:
*/

      //  System.out.print(null + true); // line1
      //  System.out.print(true + null); // line2
      //  System.out.print(null + null); // line3
        System.out.print(getString() + true); // line4


    }

    static String getString() {
        return null;
    }

    /*line1, line2, line3 – kompayl olunmur, çünki aydındır ki, true String tip deyil, null isə
burada konflikt yaradır, konkret String tipə aid etmək olmaz. Amma line4 kompayl olunur,
çünki null String tipə mənimsədilib və icra edildikdə ekrana nulltrue çap edilir*/
}
