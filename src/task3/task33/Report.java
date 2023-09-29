package task3.task33;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Report {
    public static void report(ArrayList<Emp>emps){
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        for(Emp emp: emps){
            String formattedSalary = decimalFormat.format(emp.getSalary());
            System.out.printf("%-15s %s руб.%n", emp.getName(), formattedSalary);
        }
    }
}
