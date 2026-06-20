package Payment;

public class BankTransfer extends Payment{

    public String bankName;
    public String accountNumber;
    public String referenceCode;

    public BankTransfer(double amount , String currency , String status, String bankName, String accountNumber ,String referenceCode){
        super(amount, currency, status);
        this.bankName=bankName;
        this.accountNumber=accountNumber;
        this.referenceCode=referenceCode;

    }
    public String getBankName(){
        return bankName;
    }
     public void setBankName(String bankName){
        this.bankName=bankName;
     }

     public String getAccountNumber(){
        return accountNumber;
     }

     public void setAccountNumber(String accountNumber){
        this.accountNumber =accountNumber;
     }

     public String getReferenceCode(){
        return referenceCode;
     }
     public void setReferenceCode(String referenceCode){
        this.referenceCode=referenceCode;
     }

    @Override
    public void processPayment(){
        System.out.println("Initiating bank transfer to " + bankName + " using account" + accountNumber +"  with reference" + referenceCode);
        markAsComplete();

    }
}
