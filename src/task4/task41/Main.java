package task4.task41;

public class Main {
    enum Season {
        SPRING(15) {},
        SUMMER(25) {
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        },
        AUTUMN(10) {},
        WINTER(-10){};
        private final int averageTemp;

        Season (int averageTemp){
            this.averageTemp = averageTemp;
        }

        public String getDescription() {
            return "Холодное время года";
        }

        public int getAverageTemp () {
            return this.averageTemp;
        }
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
        }
    }

    public static void main(String[] args) {

        for (Season x : Season.values()) {
            printSeasonMessage(x);
            System.out.println(x + ": " + x.getDescription() + "; средняя температура " + x.getAverageTemp() + "°C" );
        }
    }
}