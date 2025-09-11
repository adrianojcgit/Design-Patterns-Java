package v2.creator;

import v2.product.IPhone;
import v2.product.IPhoneX;
import v2.product.IPhoneXSMax;

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
