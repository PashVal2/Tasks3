package task2.task24;
import java.util.ArrayList;
public class Shop {
    private final ArrayList<String> list = new ArrayList<>();
    public void addComp(String tag) {
        this.list.add(tag);
    }
    public void deleteComp(String tag) {
        this.list.remove(tag);
    }
    public boolean findComp(String tag) {
        return this.list.contains(tag);
    }
}
