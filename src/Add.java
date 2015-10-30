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
	private Scanner scan = new Scanner(System.in);
	private ArrayList<StudentInfo> students;
	private String id;
	private String name;
	private String department;
	private String phone;
	
	Add(ArrayList<StudentInfo> students){
		System.out.println("Add");
		this.students = students;
	}
	
	public ArrayList<StudentInfo> add(){
		System.out.print("id: ");
		id = scan.nextLine();
		System.out.print("name: ");
		name = scan.nextLine();
		System.out.print("department: ");
		department = scan.nextLine();
		System.out.print("phone: ");
		phone = scan.nextLine();
		student = new StudentInfo(id, name, department, phone);
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
