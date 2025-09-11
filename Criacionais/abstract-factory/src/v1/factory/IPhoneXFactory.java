package v1.factory;

import v1.factory.abstractFactory.CountryRulesAbstractFactory;
import v1.model.iphone.IPhone;
import v1.model.iphone.IPhoneX;
import v1.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory{
    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIPhone(String level) {
        if(level.equals("standard")) {
            return new IPhoneX(rules);
        } else if(level.equals("highEnd")) {
            return new IPhoneXSMax(rules);
        } else return null;
    }
}
