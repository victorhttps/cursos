package services;

import entities.Contract;
import entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            Date dueDate = addMonths(contract.getDate(), i);
            contract.getInstallments().add(new Installment(dueDate, fullQuota));

        }
    }

    private Date addMonths(Date date, int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, n);
        return calendar.getTime();
    }
}
