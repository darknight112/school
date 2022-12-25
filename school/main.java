package school;

import java.util.*;

public class main {

	public static void main(String[] args) {
		School school = new School();
		Scanner sr = new Scanner(System.in);
		List<Department> department11 = new ArrayList<Department>();

		int newInput = 0;
		System.out.println("Enter School name ");
		String sname = sr.next();
		school.setName(sname);
		System.out.println("Enter School ID ");
		int schoolId = sr.nextInt();
		school.setId(schoolId);
		boolean loop = true;
		boolean condition = true;

		while (loop) {

			System.out.println("Enter 1 to Create Department");
			System.out.println("Enter 0 to exit ");
			int input = sr.nextInt();

			if (input == 1) {
				System.out.println("Enter Department name ");
				String depName = sr.next();
				Department d = new Department();
				d.setName(depName);
				System.out.println("Enter Department ID ");
				int depId = sr.nextInt();
				d.setId(depId);
				condition = true;
				while (condition) {
					Teacher t = new Teacher();

					System.out.println("Enter Teacher name ");
					String teacherIn = sr.next();
					t.setName(teacherIn);
					System.out.println("Enter Teacher ID ");
					int teacherId = sr.nextInt();
					t.setId(teacherId);
					boolean studentLoop = true;
					while (studentLoop) {
						Student st = new Student();

						System.out.println("Enter Student name ");
						String studentIn = sr.next();
						st.setName(studentIn);
						System.out.println("Enter Student ID ");
						int studentId = sr.nextInt();
						st.setId(studentId);
						boolean courseLoop = true;
						while (courseLoop) {

							Course c = new Course();
							System.out.println("Enter Course name ");
							String courseIn = sr.next();
							c.setName(courseIn);
							System.out.println("Enter Course ID ");
							int courseId = sr.nextInt();
							c.setId(courseId);

							System.out.println("Enter Mark ");
							int markIn = sr.nextInt();
							c.mark.setMark(markIn);
							st.courseList.add(c);
							System.out.println("Do you want to add more course? 1--> yes 2--> no ");
							int newCourse = sr.nextInt();
							if (newCourse == 2) {
								courseLoop = false;

							}

						}
						t.studentList.add(st);
						System.out.println("Do you want to add more student? 1--> yes 2--> no ");
						int newStudent = sr.nextInt();
						if (newStudent == 2) {
							studentLoop = false;

						}
					}
					d.teacherList.add(t);

					System.out.println("Do you want to add more teachers? 1--> yes 2--> no ");
					int select = sr.nextInt();
					if (select == 2) {
						condition = false;

					}

				}
				department11.add(d);
			}

 
			
			else {
				System.out.println("exit ");
				loop = false;

			}

		}
	}

}
