package v1.factory.abstractFactory;

import v1.model.certificate.BrazilianCertificate;
import v1.model.certificate.Certificate;
import v1.model.packing.BrazilianPacking;
import v1.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
