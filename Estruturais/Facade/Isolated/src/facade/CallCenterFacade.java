package facade;

import model.Card;
import services.CardService;
import services.PaymentService;
import services.RegisterService;
import services.ReportService;

public class CallCenterFacade {
    CardService cardService;
    RegisterService registerService;
    ReportService reportService;
    PaymentService paymentService;

    public CallCenterFacade() {
        cardService = new CardService();
        registerService = new RegisterService();
        reportService = new ReportService(registerService);
        paymentService = new PaymentService(registerService);
    }

    public Long getCardByUser(Long l) {
        Card card = cardService.getCardByUser(l);
        return card.getCardNumber();
    }

    public void getSumary(Long cardNumber) {
        reportService.getSumary(new Card(null, cardNumber));
    }

    public void getPaymentInfoByCard(Long cardNumber) {
        paymentService.getPaymentInfoByCard(new Card(null, cardNumber));
    }
}
