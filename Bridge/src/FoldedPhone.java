public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    void open() {
        System.out.print("折叠手机:");
        super.open();
    }

    void call() {
        System.out.print("折叠手机:");
        super.call();
    }

    void close() {
        System.out.print("折叠手机:");
        super.close();
    }
}
