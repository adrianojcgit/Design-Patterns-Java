package v1.creator;

import v1.product.IPhone;
import v1.product.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhone11();
    }
}
