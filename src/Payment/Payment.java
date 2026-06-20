package Payment;

public class Payment {

    public double amount;
    public String currency;
    public String status;

    public Payment(double amount , String currency , String status){
        this.amount   = amount;
        this.currency = currency;
        this.status   = status;
    }

    //Getters and Setters

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    public String getCurrency(){
        return currency;
    }
    public void setCurrency(String currency){
        this.currency=currency;
    }

    public String getStatus(){
        return status;

    }

    public void setStatus(String status){
        this.status = status;
    }

    public void processPayment(){
        System.out.println("Processing generic payment......");
    }

    public void generateReceipt(){
        System.out.println("Receipt for" +" " + " " +amount + currency);

    }

    public void markAsComplete(){
        this.status="COMPLETED";

    }
}
