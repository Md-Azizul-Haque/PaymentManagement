import java.util.*;

public class PaymentManagement{
	
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Please give student name");
		 String name = input.next();
		 System.out.println("Please give student id");	
		 int id = input.nextInt();
		 System.out.println("Please give student age");
		 int age = input.nextInt();
		 System.out.println("Please give student cgpa");
 		 double cgpa = input.nextDouble(); 
 		 
 		 System.out.println("Please give student payment amount");
 		 int amount = input.nextInt();

 		 Student student = new Student(name, id, age, cgpa);
 		 
		 //Tuition fee payment system
		 PaymentEngine paymentEngine = new PaymentEngine(student);
		
		 BkashPayment bkashPayment = new BkashPayment(amount);
		 paymentEngine.accept(bkashPayment);
		
		 CashPayment cashPayment = new CashPayment(amount);
		 paymentEngine.accept(cashPayment);
	 }
}