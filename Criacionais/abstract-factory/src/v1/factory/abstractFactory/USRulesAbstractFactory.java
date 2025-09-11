package v1.factory.abstractFactory;

import v1.model.certificate.Certificate;
import v1.model.certificate.USCertificate;
import v1.model.packing.Packing;
import v1.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
}
