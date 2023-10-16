package homeworkweek6;

public class Programme4 {
    int a = 50;// is a Instance Variable
    int b = 10;// is a Instance Variable

    static String name = "Java";// is a static Variable
    static String rename = "Variable";// is a static variable

    // d1 is a Instance Method
        public void d1(){
        Programme4 obj = new Programme4();
        System.out.println(a);
        System.out.println(b);
        System.out.println(obj.name);
        System.out.println(obj.rename);
    }

    // z1 is a Static Method
        public static void e1(){
        Programme4 z1 = new Programme4();
        System.out.println(z1.a);
        System.out.println(z1.b);
        System.out.println(name);
        System.out.println(rename);
    }
     // call in main method
    public static void main(String[] args) {
        Programme4 f1 = new Programme4();
        f1.d1();
        e1();
    }
}
