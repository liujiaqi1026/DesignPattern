import java.util.Scanner;

/**
 * 因为使用了抽象工厂，这里的代码完全不用改动。
 * 每次都是利用多态，不关心具体是什么factory。
 */
public class OrderPizza {
    AbstractFactory factory;

    private void setFactory(AbstractFactory factory) {
        this.factory = factory;
        Pizza pizza = null;

        while (true) {
            String pizzaType = getType();

            /**
             * 这里也利用多态，不关心具体的Pizza是什么。
             */
            pizza = factory.createPizza(pizzaType);
            if(pizza != null) {
                pizza.prepare();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        }
    }

    public OrderPizza(AbstractFactory factory) {
        setFactory(factory);
    }

    public String getType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the pizza type you want:");
        return sc.nextLine();
    }
}
