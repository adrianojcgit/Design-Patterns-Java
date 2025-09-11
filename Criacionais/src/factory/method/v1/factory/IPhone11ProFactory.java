package factory.method.v1.factory;

import factory.method.v1.model.IPhone;
import factory.method.v1.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
