package school;

import java.util.*;

public class Course {

	private int id;
	private String name;
	
	Mark mark = new Mark();
	List <Mark> markList = new ArrayList<Mark>();

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
