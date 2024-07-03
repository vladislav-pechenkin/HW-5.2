public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int client = 1;
        if (client == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке: ...");
        } else if (client == 1) {
            System.out.println("Установите версию приложения для Android по ссылке: ...");
        } else {
            System.out.println("Вы ввели неправильные данные.");
        }

        System.out.println("Задача 2");

        int client1 = 1;
        int clientDeviceYear = 2014;
        if (client1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке: ...");
        } else if (client1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке: ...");
        }
        if (client1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: ...");
        } else if (client1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке: ...");
        }

        System.out.println("Задача 3");

        int year = 2021;
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задача 4 ");

        int deliveryDistance = 105;
        int deliveryPerDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней - " + deliveryPerDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней - " + (deliveryPerDay + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней - " + (deliveryPerDay + 2));
        } else {
            System.out.println("Доставки нет.");
        }

        System.out.println("Задача 5");

        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Ошибка.");
        }

    }
}