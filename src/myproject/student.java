package myproject;
import java.util.Scanner; 
public class student {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Roll Number");
	int rollNum = s.nextInt();
	System.out.println("Enter Name");
	String Name = s.next();
	System.out.println("Enter Marks in three subjects");
	double mark1 = s.nextDouble();
	double mark2 = s.nextDouble();
	double mark3 = s.nextDouble();
	double total = mark1+mark2+mark3;
	double avg = total / 3;
	System.out.println("Roll Num= "+rollNum);
	System.out.println("Name = "+Name);
	System.out.println("Total Marks = "+total);
	System.out.println("Average = "+avg);
	
	

	}

}
