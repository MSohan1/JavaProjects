package studentDetailsValidation;

public class InvalidStudentIdException extends RuntimeException 
{
	@Override
	public String toString() {
	
		return getClass()+" : Id should not exceed to 4";
	}
}
