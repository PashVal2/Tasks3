package task2.task24;
import java.util.ArrayList;
public class Shop { // класс магазина
    private final ArrayList<String> list = new ArrayList<>();
    public void addComp(String tag) {
        this.list.add(tag);
    } // добавить комп
    public void deleteComp(String tag) {
        this.list.remove(tag);
    } // удалить комп
    public boolean findComp(String tag) {
        return this.list.contains(tag);
    } // найти комп
}
