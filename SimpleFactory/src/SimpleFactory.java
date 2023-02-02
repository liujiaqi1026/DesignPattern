public class SimpleFactory {

    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        switch (pizzaType) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepper":
                pizza = new PepperPizza();
                break;
                // add more pizza types here.
            default:
                break;
        }

        return pizza;
    }
}
