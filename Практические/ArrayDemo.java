package practice04;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 42, 18};

        System.out.println("Элементы массива:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int sum = 0;
        int max = numbers[0];
        boolean contains42 = false;

        for (int number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }
            if (number == 42) {
                contains42 = true;
            }
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Массив содержит число 42: " + contains42);
    }
}
