package practice17;

import java.util.HashMap;
import java.util.Map;

public class GradeBookDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> gradeBook = new HashMap<>();

        gradeBook.put("Анна", 91);
        gradeBook.put("Иван", 82);
        gradeBook.put("Мария", 96);
        gradeBook.put("Олег", 74);
        gradeBook.put("Екатерина", 88);

        String studentName = "Мария";
        System.out.println("Оценка студента " + studentName + ": " + gradeBook.get(studentName));

        String nameToCheck = "Иван";
        System.out.println("Есть ли студент " + nameToCheck + ": " + gradeBook.containsKey(nameToCheck));

        gradeBook.remove("Олег");

        System.out.println("Журнал после удаления одного студента:");
        for (Map.Entry<String, Integer> entry : gradeBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
