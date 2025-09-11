package v1.creator;

import v1.product.IPhone;
import v1.product.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhoneX();
    }
}
