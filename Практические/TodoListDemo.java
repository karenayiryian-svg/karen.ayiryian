package practice08;

import java.util.ArrayList;
import java.util.Collections;

public class TodoListDemo {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Сделать домашнее задание");
        tasks.add("Прочитать главу учебника");
        tasks.add("Повторить Java");

        System.out.println("Исходный список задач:");
        printTasks(tasks);

        tasks.remove(1);
        System.out.println("После удаления второй задачи:");
        printTasks(tasks);

        String taskToFind = "Повторить Java";
        System.out.println("Есть ли задача \"" + taskToFind + "\": " + tasks.contains(taskToFind));

        Collections.sort(tasks);
        System.out.println("Отсортированный список задач:");
        printTasks(tasks);
    }

    private static void printTasks(ArrayList<String> tasks) {
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
