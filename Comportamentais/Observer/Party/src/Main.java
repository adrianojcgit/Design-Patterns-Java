import observers.Friend;
import observers.Wife;
import subject.Doorman;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        doorman.add(new Wife());
        doorman.add(new Friend());

        System.out.println("Husband is comming");
        doorman.setStatus(true);
    }
}