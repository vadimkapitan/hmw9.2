import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYear(2020);
        appVersion(0, 2000);
        appVersion(1, 2023);
        printDeliveryDays(95);
        printDeliveryDays(900);
    }

    public static void isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год, - високосный год.");
        } else {
            System.out.println(year + " год, - не високосный год.");
        }
    }

    public static void appVersion(int mobileOS, int mobileYear) {
        int currentYear = LocalDate.now().getYear();
        String mobileOSName;

        switch (mobileOS) {
            case 0 -> mobileOSName = "iOS";
            case 1 -> mobileOSName = "Android";
            default -> mobileOSName = "Error";
        }

        if (mobileYear != currentYear) {
            System.out.println("Для ОС " + mobileOSName + " необходимо установить lite-версию приложения.");
        } else {
            System.out.println("Для ОС " + mobileOSName + " необходимо установить обычную версию приложения.");
        }
    }

    public static int deliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else
            return -1;
    }

    public static void printDeliveryDays(int distance) {
        int days = deliveryDays(distance);

        if (days > 0) {
            System.out.println("Потребуется дней - " + days);
        } else
            System.out.println("Доставка не осуществляется");
    }
}
