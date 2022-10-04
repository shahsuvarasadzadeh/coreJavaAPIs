import java.util.*;

public class extra1 {
    public static void main(String[] args) {
        String s = "";
        StringBuilder sb = new StringBuilder();
        int[] array = new int[2];
        List list = new ArrayList();

        int a=s.length(); // 0
      //  s.capacity(); // DOES NOT COMPILE
       // s.size(); // DOES NOT COMPILE

        System.out.println(a);

        sb.length();
        System.out.println( sb.capacity()); // ancaq StringBuilder`ə aiddir
        // sb.size(); // DOES NOT COMPILE

       // array.length(); // DOES NOT COMPILE
        // array.length; // DOES NOT COMPILE --> not a statement
        System.out.println(array.length);
        // array.capacity(); // DOES NOT COMPILE
        // array.size(); // DOES NOT COMPILE

      //  list.length(); // DOES NOT COMPILE
       // list.capacity(); // DOES NOT COMPILE
        list.size();

    }
}
