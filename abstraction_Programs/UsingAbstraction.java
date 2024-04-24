package abstraction_Programs;

public class UsingAbstraction {

	public static void main(String[] args) 
	{
		
		Sample sample = HelperClass.getObject();
		System.out.println(sample.cycle());
		System.out.println(sample.hike());
		sample.walk();
		sample.Run(100);
	}

}
