public class Main {
    public static void main(String[] args) {
        //task1-2
        boolean clientOS = true;
        int clientDeviceYear = 2015;
        if (clientOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (!clientOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (!clientOS && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        //task3
        int year = 2015;
        if (year < 1584) {
            System.out.println("В " + year + " году еще не знали про весокосные года");
        } else if (year % 4 != 0) {
            System.out.println(year + " не весокосный год");
        } else if (year % 400 == 0) {
            System.out.println(year + " весокосный год");
        } else if (year % 100 == 0) {
            System.out.println(year + " не весокосный год");
        } else {
            System.out.println(year + " весокосный год");
        }
        //task4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
        //task5
        int monthNumber = 6;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Введите коректный номер месяца");
        }
    }
}