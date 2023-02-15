public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int payment1 = (int) service.calculate(1000000, 9.99, 12);
        int payment2 = (int) service.calculate(1000000, 9.99, 24);
        int payment3 = (int) service.calculate(1000000, 9.99, 36);

        System.out.println("payment(12):" + payment1);
        System.out.println("payment(24):" + payment2);
        System.out.println("payment(36):" + payment3);
    }
}