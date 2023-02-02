/**
 * 懒汉式 静态内部类实现
 */
public class StaticInnerClassLock {
    private StaticInnerClassLock() {

    }

    // 静态内部类只有在使用到的时候才会装载，所以是懒加载。
    // 同时加载时初始化，可以保证线程安全。
    private static class Instance {
        private static final StaticInnerClassLock INSTANCE = new StaticInnerClassLock();
    }

    public static StaticInnerClassLock getInstance() {
        return Instance.INSTANCE;
    }
}
