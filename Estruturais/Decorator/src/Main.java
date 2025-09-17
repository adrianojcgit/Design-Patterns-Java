import CoofeeShop.model.Drink;
import CoofeeShop.model.Expresso;
import CoofeeShop.model.Tea;
import CoofeeShop.model.decorators.DoubleDrink;
import CoofeeShop.model.decorators.Milk;

public class Main {
    public static void main(String[] args) {
        order("Expresso", new Expresso());
        order("Tea", new Tea());
        order("Lungo", new DoubleDrink(new Expresso()));
        order("Cafe Au Lait", new Milk(new Expresso()));
        order("English Tea", new Milk(new Tea()));
    }

    public static void order(String name, Drink drink) {
        System.out.println("Ordering a " + name);
        drink.serve();
        System.out.println(drink.getPrice());
        System.out.println("---------------");
    }
}