package homeworkweek6;

/**
 * static variable - class
 * scope - within the class
 * Memory allocation - when class is loaded
 * store - non heap memory
 */
public class Programme2 {

    static int a = 5;// is a static variable
    static String name = "Java Variable";// name is a static variable

    // Static method
        public static void d1(){
        System.out.println(a);
        System.out.println(name);
    }

    public static void main(String[] args) {
        d1();
    }
}
