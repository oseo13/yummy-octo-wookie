import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author ������
 * �л����� �߰��� ���� Ŭ����
 */

public class Add {
	private StudentInfo student;
	Scanner scan = new Scanner(System.in);
	ArrayList<StudentInfo> students;
	
	Add(ArrayList<StudentInfo> students){
		String id;
		String name;
		String department;
		String phone;
		System.out.println("Add");
		System.out.print("id: ");
		id = scan.nextLine();
		System.out.print("name: ");
		name = scan.nextLine();
		System.out.print("department: ");
		department = scan.nextLine();
		System.out.print("phone: ");
		phone = scan.nextLine();
		this.students = students;
		student = new StudentInfo(id, name, department, phone);
	}
	
	public ArrayList<StudentInfo> add(){
		students.add(student);
		Collections.sort(students, new Comparator<StudentInfo>(){
			
			@Override
			public int compare(StudentInfo arg0, StudentInfo arg1) {
				// TODO Auto-generated method stub
				return arg0.getId().compareToIgnoreCase(arg1.getId());
			}
		});
		return students;
	}
}
