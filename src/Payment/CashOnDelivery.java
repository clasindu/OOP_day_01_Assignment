package Payment;

public class CashOnDelivery extends Payment{

    public String deliveryAddress;


    public CashOnDelivery(double amount , String currency , String status, String deliverAddress){
        super(amount, currency, status);
        this.deliveryAddress = deliverAddress;
    }

    public String getDeliveryAddress(){
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress){
        this.deliveryAddress=deliveryAddress;
    }

    @Override
    public void processPayment(){
        System.out.println("Cash will be collected at delivery address: " + deliveryAddress);

    }

}
