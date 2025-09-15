package builder;

import model.Salad;

public class SaladBuilder extends MealBuilderOpt{
    public Salad getResult() {
        return new Salad(toppings, sauces, size, cheese, pepper);
    }
}
