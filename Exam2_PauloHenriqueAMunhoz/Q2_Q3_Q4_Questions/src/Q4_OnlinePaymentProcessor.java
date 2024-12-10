import java.util.UUID;     // UUID stands for Universally Unique Identifier,
                           //which is a 128-bit long value used for identifying information in computer systems.

public abstract class Q4_OnlinePaymentProcessor implements Q4_PaymentProcessor {
	//Attributes
    protected String transactionId;
    protected boolean success;
    
    //Constructor
    public Q4_OnlinePaymentProcessor() {
    	
        this.transactionId = generateTransactionId();
        this.success = false;
        
    }
    //Method to create a generate ID
    private String generateTransactionId() {
    	
        return UUID.randomUUID().toString();
        
    }
    //Method to get Transaction ID
    public String getTransactionId() {
    	
        return transactionId;
        
    }
    // Method boolean about the transaction
    public boolean isSuccessful() {
    	
        return success;
        
    }
}
