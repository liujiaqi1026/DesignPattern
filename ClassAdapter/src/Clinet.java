/**
 * 这是类适配器的实现方式。可以看到，这里src的实现采用的是类，adapter到src使用了继承。
 */
public class Clinet {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new Adapter());
    }
}
