package factory.method.v1.creator;

import factory.method.v1.product.IPhone;

public abstract class IPhoneFactory {
    public IPhone orderIPhone() {
        IPhone device = null;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone();
}
