public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditAmount = 1_000_000;    // сумма кредита в рублях
        double creditTerm = 12;             // срок кредитования в месяцах
        double percent = 9.99;              // процентная ставка
        double monthlyPayment = service.calculate(creditAmount, creditTerm, percent);
        System.out.println("Ежемесячный платеж составляет: " + Math.round(monthlyPayment) + " руб");

        System.out.println("Ежемесячный платеж составляет: " + Math.round(service.calculate(1_000_000, 24, 9.99)) + " руб");

        System.out.println("Ежемесячный платеж составляет: " + Math.round(service.calculate(1_000_000, 36, 9.99)) + " руб");
    }
}