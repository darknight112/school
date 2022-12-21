package school;

import java.util.*;

public class Student {
	private int id;
	private String name;

	Course course = new Course();
	List <Course> courseList = new ArrayList<Course>();

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
