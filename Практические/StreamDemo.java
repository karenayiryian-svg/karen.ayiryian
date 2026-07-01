package practice11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5);

        List<Integer> squaredPositiveNumbers = numbers.stream()
                .filter(number -> number > 0)
                .map(number -> number * number)
                .collect(Collectors.toList());

        System.out.println("Исходный список: " + numbers);
        System.out.println("Положительные числа в квадрате: " + squaredPositiveNumbers);
    }
}
