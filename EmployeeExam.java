public class EmployeeExam{
	int age;
	Name n; // has-a relatiosnship

public void display(int age, Name n){
	System.out.println("Age :" + age);
	System.out.println("Full Name :" + n.fname + "" + n.mname + "" + n.lname);
}
}


public static void main(String args[]){
	EmployeeExam e = new EmployeeExam();

	Name n = new Name("Amandi", "Upamitha", "Soysa");

	e.display(23, n)	

}
