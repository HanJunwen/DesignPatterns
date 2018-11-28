package abstractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public String createDough() {
        return "Dough";
    }

    public String createSauce() {
        return "Sauce";
    }

    public String createCheese() {
        return "Cheese";
    }

    public String[] createVeggies() {
        return new String[0];
    }

    public String createPepperoni() {
        return "Pepperoni";
    }

    public String createClams() {
        return "Clams";
    }
}
