/**
 * 这是对象适配器的实现方式。可以看到，这里src的实现采用的是类，adapter到src使用了聚合。
 * 符合 合成复用规则， 能用关联的地方不用继承。
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new Adapter(new Voltage220V()));
    }
}
