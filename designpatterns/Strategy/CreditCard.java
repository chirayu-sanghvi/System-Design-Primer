package designpatterns.Strategy;

public class CreditCard implements PaymentStrategy {

    private String name;
    private int number;
    private int cvv;

    public CreditCard(String name, int number, int cvv) {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment Successful via credit card $" + amount);
    }
    
}
