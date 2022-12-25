package school;

import java.util.*;

public class Teacher {
	private int id;
	private String name;
	Student student = new Student();
	List <Student> studentList = new ArrayList<Student>();

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
