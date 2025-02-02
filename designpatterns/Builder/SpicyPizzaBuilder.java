package designpatterns.Builder;

public class SpicyPizzaBuilder implements PizzaBuilder{
    private Pizza pizza;

    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Mushrooms");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
