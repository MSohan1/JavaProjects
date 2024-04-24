package studentDetailsValidation;

public class MainApp {

	public static void main(String[] args)
	{
		Student student1= new Student(1422, "Sohan Mallela","mallelasohan2002@outlook.com","+919347500901",0,45,78,10);
		Student student2= new Student(2622, "Bhargav Ram","BhargavRam4578@gmail.com","9347500901",0,45,78,10);
	}

}


//EmailId can be mixture of Alphabet, symbols, numbers-> but Starting letter must be alphabet and End with @gmail.com or @outlook.com or @hotmail.com or @yahoo.in 
//and EmailId Should have minimum 5 characters
//mallelasohan2002@gmail.com