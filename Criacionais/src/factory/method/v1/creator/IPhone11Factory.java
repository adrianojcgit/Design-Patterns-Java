package factory.method.v1.creator;

import factory.method.v1.product.IPhone;
import factory.method.v1.product.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhone11();
    }
}
