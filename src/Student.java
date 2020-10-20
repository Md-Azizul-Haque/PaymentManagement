public class Student {

	public String name;
	public int Id;
	public int age;
	private double CGPA;
		
	public Student(String name, int Id, int age, double CGPA) {
	
		this.name = name;
		this.Id = Id;
		this.age = age;
		this.CGPA = CGPA;
	}
		 
	public double getCGPA() {
		return CGPA;
	}

	public void printStudentInfo() {
		System.out.println("Name : "+name);
		System.out.println("ID : "+Id);
		System.out.println("Age : "+age);
		System.out.println("CGPA : "+CGPA);
	}
}