/**
 * 懒汉式，懒加载，但是线程不安全
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        // 可能多个线程都会进入这个if
        if(instance == null) {
            instance = new Singleton3();
        }

        return instance;
    }
}
