package factorymethod;

public class Main {
    /**
     * 工厂方法模式： 优点： 1.在工厂方法中，用户只需要知道所要产品的具体工厂，无需关心具体的创建过程，甚至不需要具体产品类的类名。
     *                      2.在系统增加新的产品时，我们只要添加一个具体产品类和对应的实现工厂，无需对原工厂进行任何修改，很好的符合了“开闭原则”。
     *               缺点： 1.每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，
     *                          在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖，这并不是什么好事。
     *               适用场景： 1.一个类不知道他所需要的对象的类，在工厂方法模式中，我们不需要具体产品的类名，我们只需要知道创建他的具体工厂即可。
     *                          2.一个类通过其子类来确定要创建的对象，在程序运行时，子类对象将覆盖父类对象，从而使得系统更容易扩展。
     *                          3.将创建对象的任务委托给多个工厂子类中的某一个，客户端在使用时可以无需关心是哪一个工厂子类创建产品子类，需要时间再动态指定。
     *                总结：
     *                      1.工厂方法模式完全符合“开闭原则”。
     *                      2.工厂方法模式使用集成，将对象的创建委托给子类，通过子类实现工厂方法来创建对象。
     *                      3.工厂方法允许类将实例化延伸到子类进行。
     *                      4.工厂方法让子类决定要实例化的类是哪一个，并不是工厂来决定生成哪种产品，而是在编写创建者类时，不需要知道时间创建的穿品是哪个，选择了使用
     *                          哪个子类，就已经决定了市级创建的产品是哪个了。
     *                      5.在工厂方法模式中，创建者通常会包含依赖于抽象产品的代码，而这些抽象产品是由子类创建的，创建者不需要真的知道在制作哪种具体产品。
     *              参考资料：http://www.cnblogs.com/chenssy/archive/2013/05/26/3099495.html
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("---------Joel 需要的芝加哥的深盘披萨---------");
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();       //建立芝加哥的披萨店
        Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");             //下订单
        System.out.println("Joel ordered a " + joelPizza.getName() + "\n");

        System.out.println("---------Ethan 需要的纽约风味的披萨---------");
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza ethanPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + ethanPizza.getName() + "\n");
    }
}
