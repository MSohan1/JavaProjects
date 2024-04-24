package studentDetailsValidation;

public class InvalidStudentMobileNumberException extends RuntimeException 
{
	@Override
	public String toString() {
	
		return getClass()+" : Mobile Number is Incorrect";
	}
}
