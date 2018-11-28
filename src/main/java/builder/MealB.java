package builder;

/**
 * 套餐B
 */
public class MealB extends MealBuilder {
    public void buildFood() {
        meal.setFood("套餐B：三个鸡翅");
    }

    public void buildDrink() {
        meal.setDrink("套餐B：一杯奶茶");
    }
}
