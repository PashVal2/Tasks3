package task2.task21;

public class Author { // класс Author
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender) { // конструктор
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    } // возврат name
    public String getEmail() {
        return this.email;
    } // возврат email
    public void setEmail(String email) {
        this.email = email;
    } // изменение email
    public char getGender() {
        return this.gender;
    } // возврат gender
    public String toString() { // возврат общей информации об авторе
        return "Author{" +
                "name=" + name +
                ", email=" + email +
                ", gender=" + gender + "}";
    }
}
