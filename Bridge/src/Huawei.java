public class Huawei implements Brand{
    @Override
    public void open() {
        System.out.println("huawei opened.");
    }

    @Override
    public void call() {
        System.out.println("huawei called.");
    }

    @Override
    public void close() {
        System.out.println("huawei closed.");
    }
}
