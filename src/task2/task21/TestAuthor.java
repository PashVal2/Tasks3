package task2.task21;

import task2.task21.Author;

public class TestAuthor {
    public static void main(String[] args) { // тестирование класса Author
        Author first_author = new Author("Georgin",  "chertin@gmail.com", 'm');
        System.out.println("Имя: " + first_author.getName());
        System.out.println("Email: " + first_author.getEmail());
        System.out.println("Пол: " + first_author.getGender());

        first_author.setEmail("chetin@gmail.com");
        System.out.println("Общая информация: ");
        System.out.println(first_author.toString());
    }
}
