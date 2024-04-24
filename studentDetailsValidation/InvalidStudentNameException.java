package studentDetailsValidation;

public class InvalidStudentNameException extends RuntimeException
{
	@Override
	public String toString() {
		return getClass()+" : Invalid Student Name";
	}
}
