package v1.creator;

import v1.product.IPhone;
import v1.product.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
