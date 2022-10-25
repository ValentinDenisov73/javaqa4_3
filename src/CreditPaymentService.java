public class CreditPaymentService {
    public double calculate(double a, double b, double c) {
        double d = a * (c / 12 / 100) * Math.pow(1 + c / 12 / 100, b) / ((Math.pow(1 + c / 12 / 100, b) - 1));
        return d;
    }
}
