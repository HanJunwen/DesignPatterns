package single;

public class Singleton3 {
    /**
     * 利用静态变量来记录Singleton的唯一实例
     * volatile 关键字确保：当uniqueInstance变量呗初始化成Singleton3实例时，
     * 多个线程正确地处理uniqueInstance变量
     */
    private volatile static Singleton3 uniqueInstance;

    /**
     * 构造器私有化，只有Singleton类才能调用构造器
     */
    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (uniqueInstance == null) {
            //进入同步区域
            synchronized (Singleton.class) {
                //在此检查，如果为null，则创建
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton3();
                }
            }
            uniqueInstance = new Singleton3();
        }
        return uniqueInstance;
    }
}
