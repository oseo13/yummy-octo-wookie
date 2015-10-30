import java.util.ArrayList;
import java.util.Scanner;


public class Update extends SearchIndex {
	private StudentInfo student;
	private Scanner scan = new Scanner(System.in);
	private ArrayList<StudentInfo> students;
	
	Update(ArrayList<StudentInfo> students){
		System.out.println("Update");	
		this.students = students;
		
	}
	
	public ArrayList<StudentInfo> update(){
		String updatePhoneNum;
		System.out.print("Input ID you want to upadate :");
		String id = scan.nextLine();
		
		int index = search(students, id);

		if(students.size() == index)
			System.out.println("There is no date equal to " + id + ".");
		
		else{
			System.out.print("Input phone number to Update: ");
			updatePhoneNum = scan.nextLine();
			students.get(index).setPhoneNum(updatePhoneNum);
		}
		return students;
	}
}