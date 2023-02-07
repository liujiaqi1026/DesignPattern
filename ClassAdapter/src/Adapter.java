public class Adapter extends Voltage220V implements Voltage5V{
    @Override
    public void output5V() {
        adapt();
        System.out.println("5V");
    }

    public void adapt() {
        output220V();
        System.out.println("转换！");
    }
}
