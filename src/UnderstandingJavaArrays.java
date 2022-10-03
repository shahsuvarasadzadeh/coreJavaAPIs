public class UnderstandingJavaArrays {
    public static void main(String[] args) {
        // Dəyərləri birbaşa həmin sətirdə də mənimsətmək mümkündür:

        int[] numbers = new int[]{11, 22, 33};

        // və yaxud

        int[] numbers1 = {11, 22, 33}; // anonymous array

        /*, anonim massivdə tipi qeyd etməyə ehtiyac yoxdur, amma
massivi elan edib dəyəri növbəti sətirdə mənimsətsək, o zaman kod xəta verəcəkdir. Bu zaman
sağ tərəfdə massivin tipi mütləq qeyd olunmalıdır:*/

        int[] numbers2;
      //  numbers2 = {11, 22, 33}; // does not compile
        // numbers2 = new int[3]{11, 22, 33}; // does not compile
        numbers2 = new int[]{11, 22, 33};

        // also

        // int[] a = new int[]; // does not compile - olcu verilmelidir
        int[] b = new int[-5]; // throws NegativeArraySizeException

//        Düzgün qaydada elan olunmuş massiv formaları:


        int[] arr1;
        int arr2[];
        int[] names1, types1; // both array
        int names2[], types2; // names2 is array, types2 is int

        /*equals() metodu massivin elementlərinin dəyərinə baxmır, referansların eyni obyektə
işarə edib etmədiyini yoxlayır.*/

        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3};
        int[] arr5 = arr3;
        System.out.println(arr3.equals(arr4)); // false
        System.out.println(arr3 == arr4); // false
        System.out.println(arr3.equals(arr5)); // true
        System.out.println(arr4 == arr5); // true


     /*Bəzi oxucular bu mövzunu qarışdırır, ona görə də qeyd edək ki, massivlər ayrılıqda bir obyekt
hesab edilir. Əgər siz int tipində bir massiv yaradırsınızsa, int primitiv tip olmasına
baxmayaraq yekunda yaradılan massivdir və o bir obyektdir. Ona görə də int tipində olan bir
massivi Object tipində olan bir referansa mənimsədə bilərik. Amma int primitiv tip
olduğundan int tipində olan massivi Object tipində olan massivə mənimsədə bilmərik,
nümunədən daha aydın olacaq:*/

        Object obj = new int[]{-1, 0, 1}; // is valid
       // Object[] intArr = new int[7]; // is not valid
        Object[] integerArr = new Integer[7]; // is valid




    }
}
