import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        task1();
        task2();
        task3();
    }

    /////////////////////////////////////////////////////////
    public static void task1() {
        System.out.println("Задача 1");
        int year = 2024;
        ChekleapYear(year);
    }

    public static void ChekleapYear(int year) {

        int chekYear4 = year % 4;
        int chekYear100 = year % 100;
        int chekYear400 = year % 400;

        if (chekYear4 == 0 && chekYear100 != 0 || chekYear400 == 0) {

            System.out.printf("Год %d является высокосным %n", year);
        } else {
            System.out.printf("Год %d является не высокосным %n", year);
        }

    }

    //////////////////////////////////////////////////////////
    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = LocalDate.now().getYear();
        // int clientDeviceYear =2015;
        int clientsOS = 1;
        chekApp(clientDeviceYear, clientsOS);
    }

    public static void chekApp(int clientDeviceYear, int clientsOS) {

        if (clientsOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
    }

    //////////////////////////////////////////////////
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 110;
        if(deliveryDistance>100){
            System.out.println("Доставки нет");
        }else {
            System.out.println("Потребуется дней: " + getDeliveryDay(deliveryDistance));
        }
    }

    public static int getDeliveryDay(int deliveryDistance) {

        int deliveryDay = 0;

        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryDay = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDay = 3;
        }
        return deliveryDay;
    }


}