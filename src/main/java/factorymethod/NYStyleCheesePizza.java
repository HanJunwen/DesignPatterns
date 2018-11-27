package factorymethod;

/**
 * 具体产品类
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "Ny Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sause = "Marinara Sauce";

        toppings.add("Crated Reggiano Cheese");
    }
}
