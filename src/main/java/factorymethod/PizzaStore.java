package factorymethod;


/**
 * 披萨总店
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }


    /**
     * 创建Pizza的方法交给子类去实现
     *
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}
