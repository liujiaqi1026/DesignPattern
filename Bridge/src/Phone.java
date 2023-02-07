/**
 * 桥接模式：这个抽象类像桥一样，连接了具体的手机类型，以及品牌。
 */
public abstract class Phone {
    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    void open() {
        brand.open();
    }

    void call() {
        brand.call();
    }

    void close() {
        brand.close();
    }
}
