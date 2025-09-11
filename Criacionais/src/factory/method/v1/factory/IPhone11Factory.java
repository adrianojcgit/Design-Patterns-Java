package factory.method.v1.factory;

import factory.method.v1.model.IPhone;
import factory.method.v1.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhone11();
    }
}
