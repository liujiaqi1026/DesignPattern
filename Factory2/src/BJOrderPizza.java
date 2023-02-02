public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
            case "cheese":
                pizza = new BJCheesePizza();
                break;
            case "pepper":
                pizza = new BJPepperPizza();
                break;
            default:
                break;
        }

        return pizza;
    }
}
