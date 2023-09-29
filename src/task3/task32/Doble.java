package task3.task32;

public class Doble {
    public static void main(String[] args) {
        Double first = Double.valueOf(1.15);
        System.out.println(first);

        String str = "1.24";
        Double second = Double.parseDouble(str);
        System.out.println(second);

        Double doble = Double.valueOf(47.21);
        int in = doble.intValue(); // int
        System.out.println(in);
        short sh = doble.shortValue(); // short
        System.out.println(sh);
        double d = doble.doubleValue(); // double
        System.out.println(d);
        float f = doble.floatValue(); // float
        System.out.println(f);
        long l = doble.longValue(); // long
        System.out.println(l);
        byte b = doble.byteValue(); // byte
        System.out.println(b);

        double dToPrint = 5.18;
        System.out.println(dToPrint);

        double dob = 3.14;
        String str1 = Double.toString(dob);
        System.out.println(str1);
    }
}
