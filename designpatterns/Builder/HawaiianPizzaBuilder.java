package designpatterns.Builder;

public class HawaiianPizzaBuilder implements PizzaBuilder{

    private Pizza pizza;
    @Override
    public void buildDough() {
        pizza.setDough("thin crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("white");      
    }

    @Override
    public void buildTopping() {
        // TODO Auto-generated method stub
        pizza.setTopping("Corn");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
