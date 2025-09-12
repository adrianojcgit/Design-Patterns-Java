package v2.factory;

import v2.services.CarService;
import v2.services.UserService;

public interface ServicesAbstractFactory {
    UserService getUserService();
    CarService getCarService();
}
