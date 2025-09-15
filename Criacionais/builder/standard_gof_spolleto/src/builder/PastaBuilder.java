package builder;

import model.Pasta;

public class PastaBuilder extends MealBuilderOpt{
    public Pasta getResult() {
        return new Pasta(toppings, sauces, size, cheese, pepper);
    }
}
