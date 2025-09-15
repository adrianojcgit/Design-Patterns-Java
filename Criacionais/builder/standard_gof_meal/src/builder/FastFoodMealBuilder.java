package builder;

import model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
    protected FastFoodMeal meal;

    public FastFoodMealBuilder() {
        this.meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal(){
        return meal;
    }

    public void buildDrink() {}
    public void buildMain() {}
    public void buildSide() {}
    public void buildDessert() {}
    public void buildGift() {}
}
