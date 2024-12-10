
public class Q3_AgeVerify  {
	
    public static void checkAge(int age) throws  Q3_InvalidAgeException {
    	//if to verify the age
        if (age < 18) {
        	
            throw new Q3_InvalidAgeException("Age must be minimum 18");
            
        }
    }
}
