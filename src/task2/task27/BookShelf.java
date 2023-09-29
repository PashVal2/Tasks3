package task2.task27;

import java.util.ArrayList;

public class BookShelf { // класс книжной полки
    private final ArrayList<Book>books = new ArrayList<>();
    private int cnt;

    public BookShelf() {} // конструктор

    public void addBook(String author, String name,  int date) { // добавление книги
        Book newBook = new Book(author, name, date);
        this.books.add(newBook);
        this.cnt++;
    }
    public Book getBook(int n) {
        return books.get(n);
    } // возврат книги по индексу на полке

    public Book theOldest(){ // самая старая книга
        Book theOldest = books.get(0);
        for(Book book:books){
            if(theOldest.getDateOfCreation() > book.getDateOfCreation()){
                theOldest = book;
            }
        }
        return theOldest;
    }
    public Book theNewest() { // самая молодая книга
        Book theNewest = books.get(0);
        for (Book book : books) {
            if (theNewest.getDateOfCreation() < book.getDateOfCreation()) {
                theNewest = book;
            }
        }
        return theNewest;
    }
    public void sortBooks() { // сортировка полки
        for (int i = 0; i <this.cnt; i++) {
            for(int j = 0; j < cnt;j++) {
                if (this.books.get(j).getDateOfCreation() >
                        this.books.get(i).getDateOfCreation()) {
                    Book tmp = this.books.get(j);
                    this.books.set(j, this.books.get(i));
                    this.books.set(i, tmp);
                }
            }
        }
    }
}

