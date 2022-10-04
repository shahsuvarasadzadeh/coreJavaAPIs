public class extra3 {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("meow");
        StringBuilder s2 = new StringBuilder("meow");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.toString() == "meow"); // false
       // System.out.println(s1 == "meow"); // DOES NOT COMPILE
    }
}
