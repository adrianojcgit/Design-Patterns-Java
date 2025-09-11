package v1.factory;

import v1.factory.abstractFactory.CountryRulesAbstractFactory;
import v1.model.iphone.IPhone;
import v1.model.iphone.IPhone11;
import v1.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory{
    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIPhone(String level) {
        if(level.equals("standard")) {
            return new IPhone11(rules);
        } else if(level.equals("highEnd")) {
            return new IPhone11Pro(rules);
        } else return null;
    }
}
