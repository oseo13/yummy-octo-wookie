
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ������
 * main
 */
public class ManagerTest {
	static Scanner scan = new Scanner(System.in);
	static final String FILE_NAME = "student.txt";
	public static ArrayList<StudentInfo> students;
	public static void main(String args[]){
		int selectedMenu=1;
		students = new ArrayList<StudentInfo>();
		FileIO fileIO = new FileIO();
		students = fileIO.getData();
		while(selectedMenu>=1&&selectedMenu<=4){
			showMenu();
			selectedMenu = scan.nextInt();
			executeMenu(selectedMenu);
		}
		fileIO.saveData(students);
	
	}
	
	public static void showMenu(){
		System.out.println("-------------------- menu --------------------");
		System.out.println("1. Add");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. View");
		System.out.println("���ϴ� ����� ��ȣ�� �Է����ּ���. ���α׷� ���Ḧ ���� �� 1~4 ���� ���ڸ� �Է��ϸ� ���α׷��� ����˴ϴ�.");
		System.out.print(">");
	}
	
	public static void executeMenu(int selectedMenu){
		switch(selectedMenu){
		case 1:
			Add add = new Add(students);
			students = add.add();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
		
	}
}
