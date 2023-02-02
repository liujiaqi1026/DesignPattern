public class LDOrderPizza extends OrderPizza{
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
            case "cheese":
                pizza = new LDCheesePizza();
                break;
            case "pepper":
                pizza = new LDPepperPizza();
                break;
            default:
                break;
        }

        return pizza;
    }
}
