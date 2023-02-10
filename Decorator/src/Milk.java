/**
 * 具体的decorator。这里就能用到我喝的是什么咖啡了。
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
    }

    int cost() {
        int drinkCost = drink.cost();
        int price = 5;
        System.out.println("add milk: " + price + "元");
        System.out.println("total price: " + (drinkCost + price));

        return drinkCost + price;
    }
}
