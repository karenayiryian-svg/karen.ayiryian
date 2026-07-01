package practice10;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileHandlingDemo {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Анна", "Иван", "Мария", "Олег", "Екатерина");

        try {
            writeStudentsToFile(students);
            List<String> loadedStudents = Files.readAllLines(Paths.get(FILE_NAME));

            System.out.println("Список студентов из файла:");
            for (String student : loadedStudents) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }

    private static void writeStudentsToFile(List<String> students) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (String student : students) {
                writer.write(student + System.lineSeparator());
            }
        }
    }
}
