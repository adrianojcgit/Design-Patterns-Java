package v1.creator;

import v1.product.IPhone;
import v1.product.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {
    public IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
