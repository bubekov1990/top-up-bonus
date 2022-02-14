public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int check = 100;
        int replenishment = 200;
        int payment = check + replenishment / 100;
        boolean a = check + replenishment > 1100;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int replenished;
        if (a) {
            replenished = check + replenishment + payment;
        } else {
            replenished = check + replenishment;
        }
        System.out.println(a);

    }
}