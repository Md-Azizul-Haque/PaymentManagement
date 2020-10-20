public class PaymentEngine {

	Student student;
	
	public PaymentEngine(Student student) {
		this.student = student;
	}
	
	public void accept(Payment payment) {
		System.out.println("Accepting payment : "+payment.getAmount());
		
		// showing the student information
		student.printStudentInfo();
	}
}