package factory.method.v2;

import factory.method.v2.factory.IPhone11Factory;
import factory.method.v2.factory.IPhoneFactory;
import factory.method.v2.factory.IPhoneXFactory;
import factory.method.v2.model.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhoneFactory genXFactory = new IPhoneXFactory();
        IPhoneFactory gen11Factory = new IPhone11Factory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = genXFactory.orderIPhone("standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
        System.out.println(iphone2);
    }
}
