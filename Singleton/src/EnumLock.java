public class EnumLock {
    public static void main(String[] args) {
        // 这个枚举可以保证是单例。同时线程安全。
        Singleton instance = Singleton.INSTANCE;
        System.out.println(instance.hello());
    }
}

enum Singleton {
    INSTANCE;

    public String hello() {
        return "hello world";
    }
}
