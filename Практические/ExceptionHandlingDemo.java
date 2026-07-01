package practice09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое целое число: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Введите второе целое число: ");
            int secondNumber = scanner.nextInt();

            int result = firstNumber / secondNumber;
            System.out.println("Результат деления: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: нужно вводить только целые числа.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль запрещено.");
        } finally {
            System.out.println("Работа программы завершена.");
            scanner.close();
        }
    }
}
