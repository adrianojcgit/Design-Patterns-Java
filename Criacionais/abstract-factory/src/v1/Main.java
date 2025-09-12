package v1;

import v1.factory.IPhone11Factory;
import v1.factory.IPhoneFactory;
import v1.factory.IPhoneXFactory;
import v1.factory.abstractFactory.BrazilianRulesAbstractFactory;
import v1.factory.abstractFactory.CountryRulesAbstractFactory;
import v1.model.iphone.IPhone;

public class Main {
    public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        IPhoneFactory genXFactory = new IPhoneXFactory(rules);
        IPhoneFactory gen11Factory = new IPhone11Factory(rules);

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = genXFactory.orderIPhone("standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
        System.out.println(iphone2);
    }
}
