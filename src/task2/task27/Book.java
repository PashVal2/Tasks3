package task2.task27;

import task2.task26.Circle;

public class Book { // класс книги
    private String author;
    private String name;
    private int date;

    public Book(String author, String name, int date){ // конструктор
        this.author = author;
        this.name = name;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    } // возрат автора
    public String getName() {
        return name;
    } // возврат имени
    public int getDateOfCreation() {
        return date;
    } // возврат даты создания
    public void setAuthor(String author) {
        this.author = author;
    } // установка автора
    public void setName(String name) {
        this.name = name;
    } // установка имени
    public void setDateOfCreation(int dateOfCreation) {
        this.date = dateOfCreation;
    } // установка даты создания
    public String toString() { // возврат общей информации о книге
        return "Book{" +
                "author=" + author +
                ", name=" + name +
                ", date=" + date +
                "}";
    }
}
