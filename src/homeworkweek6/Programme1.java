package homeworkweek6;
/**
 * Instance = object
 * Scope - within the class
 * Memory allocation - when object is created
 * memory - heap
 */
public class Programme1 {
    int a = 20;// is a Instance or global variable
    String name = "Java Variable"; // name is an Instance or global Variable

    // Instance method
        public void practice(){
        Programme1 t1 = new Programme1();
        System.out.println(t1.a);
        System.out.println(t1.name);
    }

    public static void main(String[] args) {
        Programme1 obj = new Programme1();
        obj.practice();
    }
}
