public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
    }
    @Override
    int cost() {
        int drinkCost = drink.cost();
        System.out.println("add chocolate: " + 6 + "元");
        System.out.println("total cost = " + (drinkCost + 6));
        return drinkCost + 6;
    }
}
