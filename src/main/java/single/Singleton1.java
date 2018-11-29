package single;

public class Singleton1 {
    //利用静态变量来记录Singleton的唯一实例
    private static Singleton1 uniqueInstance;

    /**
     * 构造器私有化，只有Singleton类才能调用构造器
     */
    private Singleton1() {

    }

    public static synchronized Singleton1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
