package builder;

public class JustFriesBuilder extends FastFoodMealBuilder{
    @Override
    public void buildSide() {
        meal.setSide("Large Fries");
    }
}
