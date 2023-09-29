package task3.task33;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Emp first = new Emp("Miatlik", 1237000);
        Emp second = new Emp("Kentafaric", 100);
        ArrayList<Emp> list = new ArrayList<Emp>();
        list.add(first);
        list.add(second);
        Report.report(list);
    }
}
