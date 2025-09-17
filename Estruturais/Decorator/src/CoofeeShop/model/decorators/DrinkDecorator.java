package CoofeeShop.model.decorators;

import CoofeeShop.model.Drink;

public abstract class DrinkDecorator  implements Drink {
    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }
}
