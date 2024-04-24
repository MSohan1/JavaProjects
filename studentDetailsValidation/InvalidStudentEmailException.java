package studentDetailsValidation;

public class InvalidStudentEmailException extends RuntimeException {

	@Override
	public String toString() {
	
		return getClass()+" : You Entered Email Wrong";
	}
}
