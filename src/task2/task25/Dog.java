package task2.task25;

public class Dog {
    private String nick;
    private int age;
    public Dog (String nick, int age) {
        this.nick = nick;
        this.age = age;
    }
    public String getNick() {
        return this.nick;
    }
    public int getAge() {
        return this.age;
    }
    public void setNick(String nick) {
        this.nick = nick;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int humanAge() {
        return this.age * 7;
    }
    public String toString() {
        return "Dog{" +
                "nick=" + nick +
                ", age=" + age +
                "}";
    }
}
