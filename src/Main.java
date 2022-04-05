public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int balance = 100;
        int replenishment = 500;
        int min = 1000;
        boolean replenishes = true;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int sum = balance + replenishment;
        int bonus = replenishment / 100;
        int percent = replenishes ? bonus : sum;
        int check = percent + sum;
        if (sum > min) {

        } else {
            check = sum;
        }

        System.out.println(check);

    }
}