import mediator.Mediator;
import mediator.TranslatorMediator;
import model.EnglishUser;
import model.PortugueseUser;
import model.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Mediator chatRoom = new ChatMediator();
        Mediator chatRoom = new TranslatorMediator();

        User alan = new EnglishUser("Alan", chatRoom);
        User jose = new PortugueseUser("Jose", chatRoom);
        User sue = new EnglishUser("Sue", chatRoom);
        User maria = new PortugueseUser("Maria", chatRoom);

        chatRoom.addUser(alan);
        chatRoom.addUser(sue);
        chatRoom.addUser(maria);

        alan.sendMessage("Hello");
        maria.sendMessage("Oi", alan);

        chatRoom.removeUser(sue);

        alan.sendMessage("How are you?", maria);
        maria.sendMessage("Estou bem, obrigado.", alan);

        chatRoom.addUser(jose);

        jose.sendMessage("Oi");

        chatRoom.removeUser(maria);
    }
}