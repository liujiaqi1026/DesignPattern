public class TouchedPhone extends Phone{
    public TouchedPhone(Brand brand) {
        super(brand);
    }

    void open() {
        System.out.print("触摸手机:");
        super.open();
    }

    void call() {
        System.out.print("触摸手机:");
        super.call();
    }

    void close() {
        System.out.print("触摸手机:");
        super.close();
    }
}
