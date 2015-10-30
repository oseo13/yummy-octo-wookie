import java.util.ArrayList;
import java.util.Scanner;

public class View extends SearchIndex {
	private StudentInfo student;
	private Scanner scan = new Scanner(System.in);
	private ArrayList<StudentInfo> students;
	private String name, department, phone;
	
	View(ArrayList<StudentInfo> students){
		System.out.println("View");	
		this.students = students;
	}
	
	public void view(){
		
		System.out.print("Input ID you want to view : ");
		String id = scan.nextLine();
		
		int index = search(students, id);
		
		if(students.size() == index)
			System.out.println("There is no date equal to " + id + ".");
		else{
			System.out.println("ID: " + id);
			System.out.println("Name: " + students.get(index).getName());
			System.out.println("Department: " + students.get(index).getDepartment());
			System.out.println("Phone Number: " + students.get(index).getPhoneNum());
		}
	}
}
