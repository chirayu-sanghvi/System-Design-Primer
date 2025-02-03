package designpatterns.Observer;

import java.time.temporal.TemporalAccessor;

public class Temperature implements Observer {

    private String name;
    public Temperature(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println("Display Temperature to: " + name + ", Temperature" + temperature);
    }
    
}
