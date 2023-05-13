import java.util.List;

public class CoffeeLover {
    private List<CoffeeMachine> coffeeMachines;
    public void setCoffeeMachines(List<CoffeeMachine> coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }
    public void makeCoffee() {
        coffeeMachines.forEach(cm -> cm.start());
    }
}