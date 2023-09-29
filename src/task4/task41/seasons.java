package task4.task41;

public class seasons {
    public enum Seasons {
        Spring, Summer, Autumn, Winter
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case Summer:
                System.out.println("Я люблю лето");
                break;
        }
    }

    public static void main(String[] args) {
        // Создаем переменную для хранения любимого времени года
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Лето - это отличное время года для отдыха и путешествий!");

        printSeasonMessage(favoriteSeason);
    }
}

