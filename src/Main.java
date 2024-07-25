import java.time.LocalDate;

public class Main {
    public static void countLeapYear(int year) {
        //Задача 1: Выяснить, високосный ли введенный год
        if (year <= 1584) {
            System.out.println("Високосные года еще не введены!");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Задача 2 подобрать версию приложения для устройства клиента
    public static void clientDevice(int clientDeviceYear, byte clientOS) {

        if (clientOS == 0 && clientDeviceYear < 2024) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2024) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2024) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2024) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    //Задача 3 Расчёт времени доставки до клиента
    public static int distanceTime(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance < 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        //Ввод данных и вывод решения первой задачи
        int year = LocalDate.now().getYear();
        countLeapYear(year);
        System.out.println("Задача 2");
        //Ввод данных и вывод решения второй задачи
        int clientDeviceYear = 2010;
        byte clientOS = 0;
        clientDevice(clientDeviceYear, clientOS);
        System.out.println("Задача 3");
        //Ввод данных и вывод решения третьей задачи
        int deliveryDistance = 50;
        int days = distanceTime(deliveryDistance);
        if (days > 0) {
            System.out.println("На доставку потребуется дней: " + days + ".");
        } else {
            System.out.println("Доставки нет.");
        }
    }
}