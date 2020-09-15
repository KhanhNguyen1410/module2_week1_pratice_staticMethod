package staticmethod;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    StaticMethod(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        college = "hello";
        System.out.println(rollno+ " "+ name+ " "+ college);
    }
}
