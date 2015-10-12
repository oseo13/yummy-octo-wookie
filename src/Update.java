import java.util.ArrayList;
import java.util.Scanner;


public class Update {
	private StudentInfo student;
	Scanner scan = new Scanner(System.in);
	ArrayList<StudentInfo> students;
	
	int i;
	
	Update(ArrayList<StudentInfo> students){
		System.out.println("Update");	
		this.students = students;
		
	}
	
	public ArrayList<StudentInfo> update(){
		
		String id;
		String s;
		int index = 0;
		String updatePhoneNum;
	
		System.out.print("Input ID you want to upadate :");
		id = scan.nextLine();
		
		for(index = 0;students.size() > index && !(students.get(index).getId().equals(id)); ++index)
			;
		

		System.out.println(index);
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