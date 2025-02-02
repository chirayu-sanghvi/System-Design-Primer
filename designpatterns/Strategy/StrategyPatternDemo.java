package designpatterns.Strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCard("Chirayu Sanghvi", 123456789, 999));
        cart.checkout(100000);

        cart.setPaymentStrategy(new Paytm("chirayusanghvi@gmail.com", "Chirayu Sanghvi"));
        cart.checkout(200000);

        cart.setPaymentStrategy(new Zelle(987654321));
        cart.checkout(300000);
    }
}
