/**
 * 懒加载，双重检查，效率高，线程安全
 */
public class DoubleCheckLock {
    // volatile防止指令重排序，保证了使用的时候一定是初始化完毕的。
    // 指令重排序后可能出现 指针先引用好，后初始化的情况。
    private static volatile DoubleCheckLock lock;

    private DoubleCheckLock() {

    }

    public static DoubleCheckLock getInstance() {
        if(lock == null) {
            // 这里还是有可能多个线程进来
            // 锁的是这个类
            synchronized (DoubleCheckLock.class) {
                // 这里只会有一个线程进来
                if(lock == null) {
                    // 第一个线程能进来，其他的进不来
                    lock = new DoubleCheckLock();
                }
            }
        }

        return lock;
    }
}
