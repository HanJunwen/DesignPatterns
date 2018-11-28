package abstractfactory;

/**
 * 抽象的披萨原料工厂接口
 */
public interface PizzaIngredientFactory {
    /*
     * 在接口中，每个原料都有一个对应的方法创建该原料
     */
    public String createDough();

    public String createSauce();

    public String createCheese();

    public String[] createVeggies();

    public String createPepperoni();

    public String createClams();
}
