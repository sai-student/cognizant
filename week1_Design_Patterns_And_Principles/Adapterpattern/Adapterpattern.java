package Adapterpattern;
interface PaymentProcessor {
    void processPayment(double amount);
}

class PayPalGateway {

    public void makePayment(double amount) {
        System.out.println("Payment through PayPal : " + amount);
    }
}

class StripeGateway {

    public void payAmount(double amount) {
        System.out.println("Payment through Stripe : " + amount);
    }
}

class PayPalAdapter implements PaymentProcessor {

    private PayPalGateway gateway = new PayPalGateway();

    public void processPayment(double amount) {
        gateway.makePayment(amount);
    }
}

class StripeAdapter implements PaymentProcessor {

    private StripeGateway gateway = new StripeGateway();

    public void processPayment(double amount) {
        gateway.payAmount(amount);
    }
}

public class Adapterpattern {

    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalAdapter();
        PaymentProcessor stripe = new StripeAdapter();

        paypal.processPayment(500);
        stripe.processPayment(1000);
    }
}
