import java.io.*;
import java.util.ArrayList;

/**
 * @author 이지민
 * ArrayList<StudentInfo> 객체를 통한 입출력 메소드를 제공하는 클래스 입니다.
 */
public class FileIO {
	
	private ArrayList<StudentInfo> students;
	private ArrayList<String> person;
	private String[] tempPersonalInfo;
	
	public ArrayList<StudentInfo> getData(){
		try{
			File file = new File(ManagerTest.FILE_NAME);
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;
			person = new ArrayList<String>();
			students = new ArrayList<StudentInfo>();
			while((line = reader.readLine()) != null){
				person.add(line);
			}
			for(int i=0; i< person.size(); i++){
				tempPersonalInfo = person.get(i).split("/");
				students.add(new StudentInfo(tempPersonalInfo[0], tempPersonalInfo[1], tempPersonalInfo[2], tempPersonalInfo[3]));
			}
			reader.close();
		}catch(Exception ex){
			System.out.println("Read file Error!: " + ex);
		}
		return students;
	}
	
	public void saveData(ArrayList<StudentInfo> students){
		try{
			this.students = students;
			BufferedWriter writer = new BufferedWriter(new FileWriter(ManagerTest.FILE_NAME));
			for(StudentInfo student:students){
				writer.write(student.getId()+"/");
				writer.write(student.getName()+"/");
				writer.write(student.getDepartment()+"/");
				writer.write(student.getPhoneNum());
				writer.newLine();
				//System.out.print(student.getId()+" "+student.getName()+" "+student.getDepartment()+" "+student.getPhoneNum()+"\n");
			}
			writer.close();
		}catch(Exception ex){
			System.out.println("Write file Error!: " + ex);
		}
	}

}
