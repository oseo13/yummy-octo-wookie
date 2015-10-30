import java.util.ArrayList;

public class SearchIndex {
	
	protected int search(ArrayList<StudentInfo> students, String id){
		int index;
		for(index = 0;students.size() > index && !(students.get(index).getId().equals(id)); ++index);
		return index;
	}

}
