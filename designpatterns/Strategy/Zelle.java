package designpatterns.Strategy;

import javafx.scene.effect.Light;

public class Zelle implements PaymentStrategy{
    
    private int number;
    public Zelle(int number) {
        this.number = number;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment Successful via Zelle: $" + amount);
    }
}
