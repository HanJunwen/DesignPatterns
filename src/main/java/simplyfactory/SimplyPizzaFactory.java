package simplyfactory;

/**
 * 专门用于创建披萨的工厂类
 */
public class SimplyPizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("")) {
            pizza = new CheesePizza();
        }

        return pizza;
    }
}
