import java.util.ArrayList;
import java.util.Scanner;

public class View {
	private StudentInfo student;
	private Scanner scan = new Scanner(System.in);
	private ArrayList<StudentInfo> students;
	private String id, name, department, phone;
	
	View(ArrayList<StudentInfo> students){
		System.out.println("View");	
		this.students = students;
		System.out.print("Input ID you want to view : ");
		id = scan.nextLine();
	}
	
	public void view(){
		
		int index = 0;
		
		for(index = 0;students.size() > index && !(students.get(index).getId().equals(id)); ++index)
			;
		
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
