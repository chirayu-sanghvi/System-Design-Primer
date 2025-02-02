package designpatterns.Builder;
public class BuilderDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian = new HawaiianPizzaBuilder();
        PizzaBuilder spicy = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiian);
        waiter.constructPizza();
        Pizza hawaiianPizza = waiter.getPizza();
        System.out.println(hawaiianPizza);

        waiter.setPizzaBuilder(spicy);
        waiter.constructPizza();
        Pizza spicyPizza = waiter.getPizza();
        System.out.println(spicyPizza);
    }
}
