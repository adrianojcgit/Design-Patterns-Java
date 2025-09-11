package factory.method.v2.factory;

import factory.method.v2.model.IPhone;
import factory.method.v2.model.IPhoneX;
import factory.method.v2.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone(String level) {
        if(level.equals("standard")) {
            return new IPhoneX();
        } else if(level.equals("highEnd")) {
            return new IPhoneXSMax();
        } else return null;
    }
}
