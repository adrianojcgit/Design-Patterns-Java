package v1;

import v1.creator.IPhone11ProFactory;
import v1.creator.IPhoneFactory;
import v1.creator.IPhoneXFactory;
import v1.product.IPhone;
import v1.creator.*;

public class Main {
    public static void main(String[] args) {
        IPhoneFactory iphoneXFactory = new IPhoneXFactory();
        IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
        IPhoneFactory iphone11Factory = new IPhone11Factory();
        IPhoneFactory iphoneXSMaxFactory = new IPhoneXSMaxFactory();

        System.out.println("### Encomendar um iPhone X");
        IPhone iphone = iphoneXFactory.orderIPhone();
        System.out.println(iphone);

        System.out.println("\n\n### Encomendar um iPhone 11 HighEnd");
        IPhone iphone2 = iphone11ProFactory.orderIPhone();
        System.out.println(iphone2);

        System.out.println("\n\n### Encomendar um iPhone 11");
        IPhone iphone3 = iphone11Factory.orderIPhone();
        System.out.println(iphone3);

        System.out.println("\n\n### Encomendar um iPhone XS Max");
        IPhone iphone4 = iphoneXSMaxFactory.orderIPhone();
        System.out.println(iphone4);
    }
}
