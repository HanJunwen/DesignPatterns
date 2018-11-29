package single;

public class Singleton2 {
    //利用静态变量来记录Singleton的唯一实例,直接初始化静态变量，这样就能确保线程安全
    private static Singleton2 uniqueInstance = new Singleton2();

    /**
     * 构造器私有化，只有Singleton类才能调用构造器
     */
    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return uniqueInstance;
    }
}
