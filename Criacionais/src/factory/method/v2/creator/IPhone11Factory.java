package factory.method.v2.creator;

import factory.method.v2.product.IPhone;
import factory.method.v2.product.IPhone11;
import factory.method.v2.product.IPhone11Pro;

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
