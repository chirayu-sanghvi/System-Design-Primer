package designpatterns.Strategy;

public class ShoppingCart {
    private PaymentStrategy payment;

    public void setPaymentStrategy(PaymentStrategy pay) {
        this.payment = pay;
    }

    public void checkout(int amount) {
        payment.pay(amount);
    }
}
