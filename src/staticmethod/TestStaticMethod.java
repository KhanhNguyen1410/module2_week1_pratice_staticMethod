package staticmethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(111, "hoang");
        StaticMethod s2 = new StaticMethod(222, "khanh");
        StaticMethod s3 = new StaticMethod(333, "nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
