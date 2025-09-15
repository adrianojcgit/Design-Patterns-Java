import builder.PastaBuilder;
import builder.SaladBuilder;
import model.Pasta;
import model.Salad;
import model.Size;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PastaBuilder pastaBuilder = new PastaBuilder();
        pastaBuilder.setSize(Size.LARGE);
        Pasta p1 = pastaBuilder.getResult();
        System.out.println(p1);

        SaladBuilder saladBuilder = new SaladBuilder();
        saladBuilder.setSize(Size.SMALL);
        saladBuilder.setToppings(Arrays.asList("Bacon", "Broccoli"));
        saladBuilder.setSauce(Arrays.asList("Ceasar"));
        saladBuilder.setCheese(true);
        Salad p2 = saladBuilder.getResult();
        System.out.println(p2);

        pastaBuilder = new PastaBuilder();
        pastaBuilder.setToppings(Arrays.asList("Garlic"));
        pastaBuilder.setSauce(Arrays.asList("Funghi", "Cheese"));
        pastaBuilder.setSize(Size.STANDARD);
        pastaBuilder.setCheese(true);
        pastaBuilder.setPepper(true);
        Pasta p3 = pastaBuilder.getResult();
        System.out.println(p3);
    }
}