package FirstProject;
import java.util.*;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mark 1:");
		int mark1=sc.nextInt();
		System.out.println("Enter mark 2:");
		int mark2=sc.nextInt();
		System.out.println("Enter mark 3:");
		int mark3=sc.nextInt();
		System.out.println("Enter mark 4:");
		int mark4=sc.nextInt();
		System.out.println("Enter mark 5:");
		int mark5=sc.nextInt();
		int total=mark1+mark2+mark3+mark4+mark5;
		double average=total/5;
		
		char grade;
		if(average>=90) {
			grade='A';
		}
		else if(average>=80){
			grade='B';
		}
		else if(average>=70) {
			grade='C';
		}
		else if(average>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println("Total Marks:"+total);
		System.out.println("Average Percentage:"+average);
		System.out.println("Grade:"+grade);
	}

}
