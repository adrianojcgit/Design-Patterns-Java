package model;

import mediator.Mediator;

public final class PortugueseUser extends User {
    public PortugueseUser(String name, Mediator mediator) {
        super(name, mediator, Language.PORTUGUESE);
    }
}
