package practice06;

public class BookDemo {
    public static void main(String[] args) {
        Book firstBook = new Book("Война и мир", "Лев Толстой", 1869);
        Book secondBook = new Book("Преступление и наказание", "Фёдор Достоевский", 1866);

        firstBook.displayInfo();
        secondBook.displayInfo();

        secondBook.setYear(1867);
        System.out.println("После изменения года издания:");
        secondBook.displayInfo();
    }
}

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Книга: " + title + ", автор: " + author + ", год: " + year);
    }
}
