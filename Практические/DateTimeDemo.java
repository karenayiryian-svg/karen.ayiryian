package practice12;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1995, 3, 15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        int age = Period.between(birthDate, today).getYears();

        LocalDate nextBirthday = birthDate.withYear(today.getYear());
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        long daysUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

        System.out.println("Текущая дата: " + today.format(formatter));
        System.out.println("Дата рождения: " + birthDate.format(formatter));
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Следующий день рождения: " + nextBirthday.format(formatter));
        System.out.println("До следующего дня рождения осталось дней: " + daysUntilBirthday);
    }
}
