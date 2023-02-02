import java.util.Scanner;

/**
 * 可以看到，我们不用再关心OrderPizza里的代码了，无论以后多加什么类型的Pizza，这里的代码都不需要再改了。
 * 如果想新加Pizza，只需要添加新的实现类，以及改一下Factory的类型匹配即可。
 * 本质上就是把类型匹配的工作从Orderpizza里抽出来，放到Factory里去做，统一处理。
 */
public class OrderPizza {
    private SimpleFactory simpleFactory;
    private Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    private void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        while(true) {
            String type = getType();
            pizza = simpleFactory.createPizza(type);
            if(pizza != null) {
                pizza.setName(type);
                pizza.prepare();
                pizza.cut();
                pizza.box();
            } else break;
        }
    }

    public String getType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the pizza type you want:");
        return sc.nextLine();
    }
}
