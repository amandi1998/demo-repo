public class ExceptionDemo{
	public static void main (String args[]){
		try{
		int a, b;
		a = 10;
		b = 0;
		System.out.println("Before execution ...");
		System.out.println("The answer = "+ a/b);
		System.out.println("After execution ... the program resumes...");
		}
		catch(ArithmeticException e){
			// handling code
			System.out.println("Maths Error Occured ! Try again later");
		}

		System.out.println("After all ... rest of the program");
		
	}
}
