/**
 * 懒汉式，线程安全，但是效率低
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {

    }

    // 这里调用synchronized，虽然保证线程安全，但是效率低
    public static synchronized Singleton4 getInstance() {
        if(instance == null) {
            instance = new Singleton4();
        }

        return instance;
    }
}
