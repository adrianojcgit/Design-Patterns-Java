import builder.PastaBuilder;
import model.Pasta;

import model.Size;

public class Main {
    public static void main(String[] args) {
        Pasta p1 = new PastaBuilder(Size.LARGE).now();
        System.out.println(p1);

        Pasta p2 = new PastaBuilder(Size.SMALL)
                .withToppings("Bacon", "Broccoli")
                .withSauces("Tomato")
                .withCheese()
                .now();
        System.out.println(p2);

        Pasta p3 = new PastaBuilder(Size.STANDARD)
                .withToppings("Garlic")
                .withSauces("Funghi", "Cheese")
                .withCheese()
                .withPepper()
                .now();
        System.out.println(p3);
    }
}