import model.Drink;
import model.Expresso;
import model.Tea;
import model.decorators.DoubleDrink;
import model.decorators.Milk;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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