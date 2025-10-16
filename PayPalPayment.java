public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with PayPal.");
    }


    public static void main(String[] args) {
        Payment payment = new PayPalPayment();
        payment.pay(50.0);
    }
}