public class Q4_PayPalProcessor extends Q4_OnlinePaymentProcessor {
    @Override
    public void processPayment(double amount) {
    	
        //PayPal payment processing logic
        System.out.println("Processing PayPal payment of $" + amount);
        success = true; 											 // Assuming the payment was successful
        
    }
}
