package studentDetailsValidation;

public class InvalidStudentPercentageException extends RuntimeException {

	@Override
	public String toString() {
	
		return getClass()+" : Error in Percentages";
	}
}
