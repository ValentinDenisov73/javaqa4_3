public class CreditPaymentService {
    public double calculate(double creditAmount, double creditTerm, double percent) {
        double monthlyPayment = creditAmount * (percent / 12 / 100) * Math.pow(1 + percent / 12 / 100, creditTerm) / ((Math.pow(1 + percent / 12 / 100, creditTerm) - 1));
        return monthlyPayment;
    }
}
