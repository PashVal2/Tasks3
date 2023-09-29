package task2.task25;

public class Dog { // класс собаки
    private String nick;
    private int age;
    public Dog (String nick, int age) { // конструктор
        this.nick = nick;
        this.age = age;
    }
    public String getNick() {
        return this.nick;
    } // возврат имени
    public int getAge() {
        return this.age;
    } // возврат возраста
    public void setNick(String nick) {
        this.nick = nick;
    } // установка имени
    public void setAge(int age) {
        this.age = age;
    } // установка возраста
    public int humanAge() {
        return this.age * 7;
    } // возраст собаки в чел. годах
    public String toString() { // возврат общей информации о собаке
        return "Dog{" +
                "nick=" + nick +
                ", age=" + age +
                "}";
    }
}
