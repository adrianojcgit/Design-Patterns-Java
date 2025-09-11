package factory.method.v1.factory;

import factory.method.v1.model.IPhone;
import factory.method.v1.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
