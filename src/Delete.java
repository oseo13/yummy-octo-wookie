import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ������
 * �л����� ���Ÿ� ���� Ŭ����
 */

public class Delete {

	private StudentInfo student;
	Scanner scan = new Scanner(System.in);
	ArrayList<StudentInfo> students;

	Delete(ArrayList<StudentInfo> students){
		System.out.println("Delete");
		this.students = students;
	}
	
	public ArrayList<StudentInfo> delete(){
		
		System.out.println("id: ");
		Scanner s = new Scanner(System.in);
		String deleteid = s.nextLine();
		int count = students.size();
		int index;
		
		for(index = 0;students.size() > index && !(students.get(index).getId().equals(deleteid)); ++index)
			;
		
		students.remove(index);
		return students;
		
	}

}