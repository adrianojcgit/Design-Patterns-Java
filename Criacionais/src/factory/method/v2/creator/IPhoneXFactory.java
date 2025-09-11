package factory.method.v2.creator;

import factory.method.v2.product.IPhone;
import factory.method.v2.product.IPhoneX;
import factory.method.v2.product.IPhoneXSMax;

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
