package practice03;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Числа от 1 до 10 с помощью for:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0;
        int number = 1;
        while (number <= 100) {
            sum += number;
            number++;
        }
        System.out.println("Сумма чисел от 1 до 100: " + sum);

        String password;
        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
            if (!password.equals("java123")) {
                System.out.println("Неверный пароль. Попробуйте снова.");
            }
        } while (!password.equals("java123"));

        System.out.println("Доступ разрешён!");
        scanner.close();
    }
}
