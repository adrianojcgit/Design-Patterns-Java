package v2.creator;

import v2.product.IPhone;
import v2.product.IPhone11;
import v2.product.IPhone11Pro;

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
