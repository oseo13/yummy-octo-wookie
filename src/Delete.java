import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 서정은
 * 학생정보 제거를 위한 클래스
 */

public class Delete extends SearchIndex {

	private StudentInfo student;
	private Scanner scan = new Scanner(System.in);
	private ArrayList<StudentInfo> students;

	Delete(ArrayList<StudentInfo> students){
		System.out.println("Delete!!");
		this.students = students;
	}
	
	public ArrayList<StudentInfo> delete(){
		
		System.out.println("id: ");
		String id = scan.nextLine();
		
		students.remove(search(students, id));
		return students;
		
	}

}