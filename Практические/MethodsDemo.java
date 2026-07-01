package practice05;

public class MethodsDemo {
    public static void main(String[] args) {
        System.out.println("sum(5, 7) = " + sum(5, 7));
        System.out.println("sum(2, 4, 6) = " + sum(2, 4, 6));
        System.out.println("Число 10 чётное: " + isEven(10));
        System.out.println("Число 15 чётное: " + isEven(15));
        printMessage("Методы успешно работают.");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
