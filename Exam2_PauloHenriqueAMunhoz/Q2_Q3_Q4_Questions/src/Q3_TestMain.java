import java.util.Scanner;

public class Q3_TestMain {
	
    public static void main(String[] args) {
    	// create the object in of type scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        // Create a try here
        try {
        	// The in will take the informations that user send via keyboard, of int type
            int age = in.nextInt();
            //The age will be verified by method checkAge of class Q3_AgeVerify
            Q3_AgeVerify.checkAge(age);
            //So a message will appear for user if Age was passed.
            System.out.println("Age verification passed.");
            
        //This catch will take Invalid Age Exception    
        } catch ( Q3_InvalidAgeException e) {
        	//The message will appear that the user has invalid age.
            System.out.println("Invalid Age: " + e.getMessage());
        //This catch will work in others exceptions    
        } catch (Exception e) {
        	//The message will appear that the user insert an invalid input via keyboard.
            System.out.println("Something is wrong: " + e.getMessage());
        //The finally always will work to close the object in of type scanner    
        } finally {
            in.close();
            
        }
    }
}
