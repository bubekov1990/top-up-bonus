public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int balance = 1000;
        int replenishment = 300;
        int sum = balance + replenishment;
        int bonus = sum / 100;
        boolean replenishes = true;
        int percent = replenishes ? bonus : sum;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int check = percent + sum;
        int min = 1000;
        if (sum > min) {

        } else {
            check = sum;
        }

        System.out.println(check);

    }
}