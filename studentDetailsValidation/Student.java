//WAP for below requirment
//a)Program for Student
//b)Student characteristics are StudentId,StudentNamr,StudentEmailId,StudentMobileNumber,10th%,inter%,degree%,MasterDegree%
//preConditions:-	StudentId should have only 4 digits
//					StudentName only Alphabets,Can have Multiple words,single space is allowed b/w the words
//					EmailId can be mixture of Alphabet, symbols, numbers-> but Starting letter must be alphabet and End with @gmail.com or @outlook.com or @hotmail.com or @yahoo.in 
//					and EmailId Should have minimum 5 characters
//					Mobile NUmber must have 10Digits and must begin with +91
//					All %'s => must be b/w 0 to 100
//
//Requirment :	initilize validate print accordingly,throw exception in case of invalid inputs
//				minimum 2 obj creation, donot handle the exception

package studentDetailsValidation;

public class Student {
	private int StudentID;
	private String StudentName;
	private String StudentEmail;
	private String StudentMobileNumber;
	private int Student10th;
	private int Studentinter;
	private int StudentDegree;
	private int StudentMasters;



	public Student(int  StudentID,String StudentName,String StudentEmail, String StudentMobileNumber,int Student10th,int Studentinter,int StudentDegree,int StudentMasters)
	{
		if(validateStudentId(StudentID))
			this.StudentID = StudentID;
		
		else
			throw new InvalidStudentIdException();
		
		
		
		if(validateStudentName(StudentName))
			this.StudentID = StudentID;
		
		else
			throw new InvalidStudentNameException();
	
		if (validateMobileNumber(StudentMobileNumber))
			this.StudentMobileNumber = StudentMobileNumber;

		else
			throw new InvalidStudentMobileNumberException();	
	
	
		if (validatePercentages(Student10th,Studentinter,StudentDegree,StudentMasters))
		{
			this.Student10th = Student10th;
			this.Studentinter = Studentinter;
			this.StudentDegree = StudentDegree;
			this.StudentMasters = StudentMasters;
		}
		else
			throw new InvalidStudentPercentageException();
	
	if (validateEmailid(StudentEmail))
		this.StudentEmail = StudentEmail;
	
	else
		throw new InvalidStudentEmailException();
	
	
	print(StudentID, StudentName,StudentMobileNumber,Student10th,Studentinter,StudentDegree,StudentMasters,StudentEmail);
	
	}
	private boolean validateStudentId(int StudentID) {
		int temp = StudentID;
		int count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		if (count == 4) {
			return true;
		}
		return false;

	}

	private boolean validateStudentName(String StudentName) {
		int count = 0;

		for (int i = 0; i < StudentName.length(); i++) {
			if ((Character.isSpace(StudentName.charAt(i)) || Character.isAlphabetic(StudentName.charAt(i))))
				count++;
			if ((Character.isSpace(StudentName.charAt(i)) && (Character.isSpace(StudentName.charAt(i + 1)))))
				count--;
		}

		if (count == StudentName.length())
			return true;
		else
			return false;

	}
	private boolean validateEmailid(String StudentEmail) 
	{

		char ch = StudentEmail.charAt(0);
		int index=0;
		String domine1 = "@gmail.com";
		String domine2 = "@hotmail.com";
		String domine3 = "@yahoo.in";
		String domine4 = "@outlook.com";
		for (int i = 0; i < StudentEmail.length(); i++)
		{
			char ch1 = StudentEmail.charAt(i);
			if (ch1=='@')
			{
				index=i;
			}
		}
		String mail= "";
		for (int i = index; i < StudentEmail.length(); i++)
		{
			mail+=StudentEmail.charAt(i);
		}
//		System.out.println(mail);
		
		if(Character.isAlphabetic(StudentEmail.charAt(0)) && StudentEmail.length()>=5)
		{
			if(mail.equals(domine1)||mail.equals(domine2)||mail.equals(domine3)||mail.equals(domine4))
				return true;
		}
		return false;

	}
	
	
	private boolean validateMobileNumber(String StudentMobileNumber)
	{
		if(StudentMobileNumber.length()==13)
		{
			if(StudentMobileNumber.charAt(0)=='+')
			{
				if(StudentMobileNumber.charAt(1)=='9')
				{
//					System.out.println(StudentMobileNumber.length());
					if(StudentMobileNumber.charAt(2)=='1')
					{
						return true;
					}
				}
			}
		}
		return false;

	}
	

	private boolean validatePercentages(int Student10th,int Studentinter,int StudentDegree,int StudentMasters) 
	{
		if(Student10th>=0 && Student10th<=100)
		{
			if(Studentinter>=0 &&  Studentinter<=100)
			{
				if(StudentDegree>=0 &&  StudentDegree<=100)
				{
					if(StudentMasters>=0 &&  StudentMasters<=100)
					{
						return true;
					}
				}
			}
		}
		return false;
		
	}

	public void print(int StudentID, String StudentName,String StudentMobileNumber,int Student10th,int Studentinter,int StudentDegree,int StudentMasters,String StudentEmail) {
		System.out.println(StudentID);
		System.out.println(StudentName);
		System.out.println(StudentEmail);
		System.out.println(StudentMobileNumber);

		System.out.println(Student10th);
		System.out.println(Studentinter);
		System.out.println(StudentDegree);
		System.out.println(StudentMasters);
	}

}
