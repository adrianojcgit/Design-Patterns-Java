package factory.method.v2.factory;

import factory.method.v2.model.IPhone;
import factory.method.v2.model.IPhone11;
import factory.method.v2.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone(String level) {
        if(level.equals("standard")) {
            return new IPhone11();
        } else if(level.equals("highEnd")) {
            return new IPhone11Pro();
        } else return null;
    }
}
