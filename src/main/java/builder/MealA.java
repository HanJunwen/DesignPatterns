package builder;

/**
 * 套餐A
 */
public class MealA extends MealBuilder {
    public void buildFood() {
        meal.setFood("套餐A：一盒薯条");
    }

    public void buildDrink() {
        meal.setDrink("套餐A：一杯可乐");
    }
}
