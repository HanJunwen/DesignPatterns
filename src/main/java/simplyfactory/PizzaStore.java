package simplyfactory;

public class PizzaStore {

    //SimplyPizzaFactory的引用
    SimplyPizzaFactory factory;

    public PizzaStore(SimplyPizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        //使用工厂对象的创建方法，而不是直接new。
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
