package homeworkweek6;

/**
 *  Declare one instance and one static variable.
 *  Declare one instance method.
 *  Declare one static method.
 *  Call both instance and static variables into both instance and static methods inside the
 * print statement.
 *  Declare the Main method.
 *  Call both instance and static methods into the Main method and run the programme
 */
public class Programme3 {
    String name = "Testing"; //is an Instance variable
    static int a = 50;// is a static variable

      //Instance method
        public void c1(){
        Programme3 obj = new Programme3();
        System.out.println(name);
        System.out.println(obj.a);
    }

        // Static method
        public static void d1(){
        Programme3 t1 = new Programme3();
        System.out.println(t1.name);
        System.out.println(a);
    }
     // Call in main method
    public static void main(String[] args) {
        Programme3 t = new Programme3();
        t.c1();
        d1();

    }
}
