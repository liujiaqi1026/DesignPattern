public class Adapter implements Voltage5V{
    Voltage220V voltage220V;

    public Adapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }
    @Override
    public void output5V() {
        adapt();
        System.out.println("5V");
    }

    public void adapt() {
        voltage220V.output220V();
        System.out.println("转换！");
    }
}
