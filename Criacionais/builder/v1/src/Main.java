import builder.*;
import director.MealDirector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        order("Burguer", new Menu1Builder());
        order("Veggie Burguer", new Menu2Builder());
        order("Just Fries", new JustFriesBuilder());
        order("Heart Atack", new FatMealBuilder());
    }

    public static void order(String name, FastFoodMealBuilder builder) {
        System.out.println("Ordering a " + name);
        MealDirector director = new MealDirector(builder);
        director.constructCombo();
        System.out.println(director.getCombo());

        System.out.println("------------------");
    }
}