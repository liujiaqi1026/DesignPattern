public class Client {

    public static void main(String[] args) {
        Drink currentCoffee = new Milk(new Chocolate(new Milk(new Espress())));

        currentCoffee.cost();
    }
}
