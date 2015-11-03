
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ������
 * main
 */
public class ManagerTest {
	private static Scanner scan = new Scanner(System.in);
	public static final String FILE_NAME = "student.txt";
	private static ArrayList<StudentInfo> students;
	public static void main(String args[]){
		int selectedMenu = 1;
		students = new ArrayList<StudentInfo>();
		FileIO fileIO = new FileIO();
		students = fileIO.getData();
		while(selectedMenu >= 1 && selectedMenu <= 4){
			showMenu();
			selectedMenu = scan.nextInt();
			executeMenu(selectedMenu);
		}
		fileIO.saveData(students);
	
	}
	
	public static void showMenu(){
		System.out.println("-------------------- Menu --------------------");
		System.out.println("1. Add");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. View");
		System.out.println("���ϴ� ����� ��ȣ�� �Է����ּ���. ���α׷� ���Ḧ ���� �� 1~4 ���� ���ڸ� �Է��ϸ� ���α׷��� ����˴ϴ�.");
		System.out.print(">> ");
	}
	
	public static void executeMenu(int selectedMenu){
		switch(selectedMenu){
		case 1:
			Add add = new Add(students);
			students = add.add();
			break;
		case 2:
			Update update = new Update(students);
			students = update.update();
			break;
		case 3:
			Delete delete = new Delete(students);
			students = delete.delete();
			break;
		case 4:
			View view = new View(students);
			view.view();
			break;
		}
		
	}
}
