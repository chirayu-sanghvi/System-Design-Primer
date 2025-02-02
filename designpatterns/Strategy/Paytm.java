package designpatterns.Strategy;

public class Paytm implements PaymentStrategy{
    

    private String email;
    private String name;

    public Paytm(String email, String name) {
        this.email = email;
        this.name = name;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment Successful via Paytm $" + amount);
    }
}
