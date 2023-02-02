import java.util.Scanner;

public abstract class OrderPizza {
    public OrderPizza() {
        String pizzaType = getType();
        Pizza pizza = createPizza(pizzaType);
        pizza.setName(pizzaType);
        pizza.prepare();
        pizza.cut();
        pizza.box();
    }

    abstract Pizza createPizza(String pizzaType);

    public String getType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the pizza type you want:");
        return sc.nextLine();
    }
}
