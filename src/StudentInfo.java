	/**
	 * @author 이지민
	 * 학생정보를 담아두는 객체생성을 위한 클래스
	 */
public class StudentInfo {

	private String id;
	private String name;
	private String department;
	private String phoneNum;
	
	public StudentInfo(String id, String name, String department, String phoneNum) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.phoneNum = phoneNum;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}
