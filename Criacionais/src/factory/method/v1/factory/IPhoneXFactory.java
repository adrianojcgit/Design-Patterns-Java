package factory.method.v1.factory;

import factory.method.v1.model.IPhone;
import factory.method.v1.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhoneX();
    }
}
