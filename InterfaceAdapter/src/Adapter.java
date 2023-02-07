public abstract class Adapter implements Voltage220V, Voltage5V {

    public Adapter() {

    }

    public void output220V() {
        System.out.println("空实现");
    }

    public void output5V() {
        adapt();
        System.out.println("5V电压");
    }

    public void adapt() {
        output220V();
        System.out.println("转换");
    }
}
