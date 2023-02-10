/**
 * 具体的咖啡。可以返回咖啡的价格。
 */
public class Espress extends Coffee{
    int cost() {
        int price = 10;
        System.out.println("计算意式浓缩价格：" + price + "元");
        return price;
    }
}
