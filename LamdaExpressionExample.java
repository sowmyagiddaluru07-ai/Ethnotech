interface Addable {
    int add(int a, int b);
}

public class LamdaExpressionExample {
    public static void main(String[] args) {

        Addable ad1 = (a, b) -> (a + b);
        System.out.println("Output 1: " + ad1.add(10, 20));

        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println("Output 2: " + ad2.add(100, 200));

        Addable ad3 = (a, b) -> {
            return a + b;
        };
        System.out.println("Output 3: " + ad3.add(10, 20));

        Addable add4 = (int a, int b) -> {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            return a + b;
        };

        System.out.println("Output 4: " + add4.add(50, 60));
    }
}