import model.Address;
import model.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        User user = new User("Clone", 25, new Address("ABC Street", 1000));
        System.out.println(user);

        User cloneUser = user.clone();
        cloneUser.name = "Clone x2";
        cloneUser.address.street = "Double Street";
        System.out.println(user);
        System.out.println(cloneUser);
    }
}