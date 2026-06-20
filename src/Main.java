import Payment.BankTransfer;
import Payment.CashOnDelivery;
import Payment.CreditCardPayment;
import Payment.DebitCardPayment;
import Payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        CashOnDelivery cod = new CashOnDelivery(1000.00, "Lkr","COMPLETED", "Newtown,Ratnapura");

        BankTransfer bt   = new BankTransfer(4000.00 ,"Lkr", "PENDING","BOC Bank","9887872" ,"2345");

        CreditCardPayment ccd = new CreditCardPayment(4500.00,"Lkr","FAILED","422038393899" ,"Chamath Lasindu" ,"08/2029",50000.00);

        DebitCardPayment dcp = new DebitCardPayment(12500.00 ,"Lkr" ,"SUCCESS","420737886368", "Lasindu Rajapaksha","02/2028",35000.00);

        System.out.println("===== Cash On Delivery =====");
        cod.processPayment();
        cod.generateReceipt();

        System.out.println("\n===== Bank Transfer =====");
        bt.processPayment();
        bt.generateReceipt();

        System.out.println("\n===== Credit Card Payment =====");
        ccd.validateCard();   // inherited from CardPayment
        ccd.processPayment();
        ccd.applyInterest();
        ccd.generateReceipt();

        System.out.println("\n===== Debit Card Payment =====");
        dcp.validateCard();   // inherited from CardPayment
        dcp.processPayment();
        dcp.checkSufficientBalance();
        dcp.generateReceipt();


        // 4. Runtime polymorphism demonstration
        System.out.println("\n===== Runtime Polymorphism: List<Payment> =====");
        List<Payment> payments = new ArrayList<>();
        payments.add(cod);
        payments.add(bt);
        payments.add(ccd);
        payments.add(dcp);

        for (Payment payment : payments) {
            payment.processPayment();
        }






    }
}
