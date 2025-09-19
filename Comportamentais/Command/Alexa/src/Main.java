import alexa.Alexa;

public class Main {
    public static void main(String[] args) {
        Alexa alexa = new Alexa();
        alexa.sendRequest("Turn on the Living room light");
        alexa.sendRequest("Turn off the Kitchen light");
    }
}