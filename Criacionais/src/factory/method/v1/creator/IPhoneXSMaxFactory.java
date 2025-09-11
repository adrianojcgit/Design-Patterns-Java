package factory.method.v1.creator;

import factory.method.v1.product.IPhone;
import factory.method.v1.product.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
