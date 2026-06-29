package Strategypattern;
interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class PayPalPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

class PaymentContext {

    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}

public class Strategypattern {

    public static void main(String[] args) {

        PaymentContext payment1 =
                new PaymentContext(new CreditCardPayment());

        payment1.executePayment(5000);

        PaymentContext payment2 =
                new PaymentContext(new PayPalPayment());

        payment2.executePayment(2500);
    }
}