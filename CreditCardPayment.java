public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with credit card.");
    }

    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(50.0);
    }
}

