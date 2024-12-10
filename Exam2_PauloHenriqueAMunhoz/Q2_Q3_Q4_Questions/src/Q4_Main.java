public class Q4_Main {
	
    public static void main(String[] args) {
    	
    	
    	System.out.println("====BANCO DO BRASIL====");
    	
    	// Creating an object of type Q4_CreditCardProcessor
        Q4_PaymentProcessor creditCardProcessor = new Q4_CreditCardProcessor();
        //Setting processPayment to 10000.09
        creditCardProcessor.processPayment(10000.09);
        // Displaying the ID Transaction via get and if the payment was success with true or false
        System.out.println("ID Transaction: " + ((Q4_OnlinePaymentProcessor) creditCardProcessor).getTransactionId());
        System.out.println("Payment was successful: " + creditCardProcessor.isSuccessful());
        
        //Creating an object of type Q4_PayPalProcessor
        Q4_PaymentProcessor payPalProcessor = new Q4_PayPalProcessor();
        //Setting processPayment to 99999.08
        payPalProcessor.processPayment(99999.08);
        // Displaying the ID Transaction via get and if the payment was success with true or false
        System.out.println("ID Transaction: " + ((Q4_OnlinePaymentProcessor) payPalProcessor).getTransactionId());
        System.out.println("Payment was successful: " + payPalProcessor.isSuccessful());
        
        //Creating an object of type Q4_PayPalProcessor
        Q4_PaymentProcessor payPalProcessor2 = new Q4_PayPalProcessor();
        //Setting processPayment to 0.08
        payPalProcessor2.processPayment(0.08);
        // Displaying the ID Transaction via get and if the payment was success with true or false
        System.out.println("ID Transaction: " + ((Q4_OnlinePaymentProcessor) payPalProcessor2).getTransactionId());
        System.out.println("Payment was successful: " + payPalProcessor2.isSuccessful());
        
        // Creating an object of type Q4_CreditCardProcessor
        Q4_PaymentProcessor creditCardProcessor2 = new Q4_CreditCardProcessor();
     	//Setting processPayment to 1.09
        creditCardProcessor2.processPayment(1.09);
        // Displaying the ID Transaction via get and if the payment was success with true or false
        System.out.println("ID Transaction: " + ((Q4_OnlinePaymentProcessor) creditCardProcessor2).getTransactionId());
        System.out.println("Payment was successful: " + creditCardProcessor2.isSuccessful());
    }
}
