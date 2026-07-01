package practice13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Анна");
        students.add("Иван");
        students.add("Мария");
        students.add("Олег");
        students.add("Анна");

        System.out.println("Список студентов с повтором:");
        System.out.println(students);

        Set<String> uniqueStudents = new HashSet<>(students);
        System.out.println("Уникальные студенты:");
        System.out.println(uniqueStudents);

        Map<String, Integer> grades = new HashMap<>();
        grades.put("Анна", 91);
        grades.put("Иван", 84);
        grades.put("Мария", 96);
        grades.put("Олег", 78);

        System.out.println("Итоговые баллы:");
        for (String student : uniqueStudents) {
            System.out.println(student + ": " + grades.get(student));
        }
    }
}
