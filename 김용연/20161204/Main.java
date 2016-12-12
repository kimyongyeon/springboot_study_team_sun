import java.util.Arrays;

public class Main {

    interface Func {
        void calc(int a, int b);
    }

    static class MyCalc {
        int a, b = 0;

        public void calc(Func c) {
            c.calc(a, b);
        }
    }
    public static void main(String[] args) {
        MyCalc m = new MyCalc();
        m.a=10;
        m.b=20;
        m.calc((a, b) -> System.out.println(a + b));
        m.calc((a, b) -> System.out.println(a - b));
        m.calc((a, b) -> System.out.println(a / b));
        m.calc((a, b) -> System.out.println(a * b));
        System.out.println("hello world");
    }
}
