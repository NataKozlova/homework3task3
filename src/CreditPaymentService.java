public class CreditPaymentService {
    public double calculate(int credit, double percent, int months) {
        double m = percent / 100 / 12;
        double payment = credit * (m / (1 - Math.pow(1 + m, -months)));
        return payment;
    }

}
