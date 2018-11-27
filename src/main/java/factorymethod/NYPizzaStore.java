package factorymethod;

/**
 * 纽约披萨分店
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)){
            pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }
}
