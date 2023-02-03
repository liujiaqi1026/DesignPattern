/**
 * 原型模式的好处在于：
 * 即使我们这里把Sheep的属性增加了或者减少了，我们根本不用去操心clone的步骤，直接改就行。
 * 也就是实现了动态的克隆。
 *
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 123, "white");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep1.clone();
        System.out.println(sheep == sheep1);
        System.out.println(sheep1 == sheep2);
    }
}
