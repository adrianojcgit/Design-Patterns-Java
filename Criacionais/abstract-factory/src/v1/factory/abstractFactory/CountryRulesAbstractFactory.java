package v1.factory.abstractFactory;

import v1.model.certificate.Certificate;
import v1.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();
    Packing getPacking();
}
