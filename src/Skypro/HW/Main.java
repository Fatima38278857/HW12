package Skypro.HW;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите расстояние ('+', '-' км) от нашего офиса до адреса доставки: ");
        int deliveryDistance = in.nextInt();
         System.out.println("Срок доставки банковской карты - " + DeliveryTime(deliveryDistance));

    }
    public static String DeliveryTime (int deliveryDistance) {
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            return "1 день";
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return "2 дня.";
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            return "3 дня.";
        }
        if (deliveryDistance > 100) {
            return "по отдельной договорённости.";
        } return " зайдите ";
    }
}




