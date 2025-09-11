package factory.method.v1.creator;

import factory.method.v1.product.IPhone;
import factory.method.v1.product.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
