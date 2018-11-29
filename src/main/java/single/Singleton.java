package single;

/** 使用synchronized来处理。也就是说将getInstance()方法变成同步方法即可。
 * 单例模式： 优点 1.节约了系统资源。由于系统中只存在一个实例对象，对于一些需要频繁创建和销毁对象的系统而言，单例模式无疑节约了系统资源和提高了系统的性能。
 *                2.因为单例类封装了它的唯一实例，所以它可以严格控制客户怎样以及何时访问他。
 *
 *            缺点：1.由于单例模式中没有抽象层，因此单例类的扩展有很大的困难。
 *                  2.单例类的职责过重，在一定程度上违背了“单一职责原则”。
 *
 *            使用场景：1.系统只需要一个实例对象，如系统要求提供一个唯一的序列号生成器，或者需要考虑资源消耗太大而只允许创建一个对象。
 *                      2.客户调用类的单个实例只允许使用狗玥公共访问点，除了该公共访问点，不能通过其他途径访问该实例。
 *            总结：1.单例模式中确保程序中一个类最多只有一个实例
 *                  2.单例模式的构造器是私有了，而且他必须要提供实例的全局访问点。
 *                  3.单例模式可能会因为多线程的问题而带来安全隐患。
 *
 *              关于多线程执行创建实例时，很有可能会产生两个实例对象的解决办法：
 *              1. 使用synchronized来处理。也就是说将getInstance()方法变成同步方法即可。
 *              2.直接初始化静态变量。这样就保证了线程安全。
 *              3.用“双重检查加锁”，在getInstance()中减少使用同步。
 *             参考资料：http://www.iocoder.cn/DesignPattern/xiaomingge/Singleton-Pattern/
 *
 */
public class Singleton {
    //利用静态变量来记录Singleton的唯一实例
    private static Singleton uniqueInstance;

    /**
     * 构造器私有化，只有Singleton类才能调用构造器
     */
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
