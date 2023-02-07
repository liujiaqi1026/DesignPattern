public class Apple implements Brand{
    @Override
    public void open() {
        System.out.println("apple opened.");
    }

    @Override
    public void call() {
        System.out.println("apple called.");
    }

    @Override
    public void close() {
        System.out.println("apple closed.");
    }
}
