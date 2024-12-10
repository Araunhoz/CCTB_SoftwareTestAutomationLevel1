public class Q4_CreditCardProcessor extends Q4_OnlinePaymentProcessor {
    @Override
    public void processPayment(double amount) {
    	
        //Credit card payment processing logic
        System.out.println("Processing credit card payment of $" + amount);
        success = true;  										          // Assuming the payment was successful
    }
}
