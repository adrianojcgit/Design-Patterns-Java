package factory.method.v1.creator;

import factory.method.v1.product.IPhone;
import factory.method.v1.product.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhoneX();
    }
}
