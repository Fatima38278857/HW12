

public class А1 {
    public static void checkYear(int year) { // Метод

        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) { // Задание с висакосным годом
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }
}