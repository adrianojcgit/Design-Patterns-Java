package mediator;

import model.User;
import services.Translator;

public class TranslatorMediator extends Mediator {
    private final Translator translator = new Translator();
    @Override
    protected String getMessage(String message, User to, User from) {
        return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
    }
}
