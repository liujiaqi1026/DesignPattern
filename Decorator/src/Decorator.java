/**
 * 抽象的装饰者，以后有新的某个具体的装饰者，直接实现这个类即可。
 * 可以看到，装饰者持有咖啡。这里就知道我喝的是什么咖啡了。
 */
public abstract class Decorator extends Drink{
    Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }
}
