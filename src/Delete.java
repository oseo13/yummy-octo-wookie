import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ������
 * �л����� ���Ÿ� ���� Ŭ����
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