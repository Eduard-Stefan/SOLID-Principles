import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CoffeeMachine> coffeeMachines = new ArrayList<>();
        coffeeMachines.add(new SimpleCoffeeMachine());
        coffeeMachines.add(new ComplexCoffeeMachine());
        CoffeeLover coffeeLover = new CoffeeLover(coffeeMachines);
        coffeeLover.makeCoffee();
    }
}