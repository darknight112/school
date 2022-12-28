package school;
import java.io.*;
import java.util.Scanner;
import java.util.*;


public class main {

	public static void main(String[] args) {
		School school = new School();
		Scanner sr = new Scanner(System.in);
		List<Department> department11 = new ArrayList<Department>();
		Stack<String> inputHistory= new Stack<String>(); 

		int newInput = 0;
		System.out.println("Enter School name ");
		String sname = sr.next();
		school.setName(sname);
		inputHistory.push(sname);
		System.out.println("Enter School ID ");
		int schoolId = sr.nextInt();
		
		String schoolIdString = Integer.toString(schoolId);
		inputHistory.push(schoolIdString);
		school.setId(schoolId);
		boolean loop = true;
		boolean condition = true;



		while (loop) {

			System.out.println("Enter 1 to Create Department");
			System.out.println("Enter 2 to Print info ");
			System.out.println("Enter 3 to Print history ");
			System.out.println("Enter 4 to search for a word in user input history ");

			System.out.println("Enter 0 to exit ");
			int input = sr.nextInt();
			String inputString = Integer.toString(input);
			inputHistory.push(inputString);

			if (input == 1) {
				System.out.println("Enter Department name ");
				String depName = sr.next();
				
				inputHistory.push(depName);
				Department d = new Department();
				d.setName(depName);
				System.out.println("Enter Department ID ");
				int depId = sr.nextInt();
				String depIdString = Integer.toString(depId);
				inputHistory.push(depIdString);
				d.setId(depId);
				condition = true;
				while (condition) {
					Teacher t = new Teacher();
					System.out.println("Enter Teacher name ");
					String teacherIn = sr.next();
					inputHistory.push(teacherIn);
					t.setName(teacherIn);
					System.out.println("Enter Teacher ID ");
					int teacherId = sr.nextInt();
					String teacherIdString = Integer.toString(teacherId);
					inputHistory.push(teacherIdString);
					t.setId(teacherId);
					boolean studentLoop = true;
					while (studentLoop) {
						Student st = new Student();

						System.out.println("Enter Student name ");
						String studentIn = sr.next();
						inputHistory.push(studentIn);
						st.setName(studentIn);
						System.out.println("Enter Student ID ");
						int studentId = sr.nextInt();
						String studentIdString = Integer.toString(studentId);
						inputHistory.push(studentIdString);
						st.setId(studentId);
						boolean courseLoop = true;
						while (courseLoop) {

							Course c = new Course();
							System.out.println("Enter Course name ");
							String courseIn = sr.next();
							inputHistory.push(courseIn);
							c.setName(courseIn);
							System.out.println("Enter Course ID ");
							int courseId = sr.nextInt();
							String courseIdString = Integer.toString(courseId);
							inputHistory.push(courseIdString);
							c.setId(courseId);

							System.out.println("Enter Mark ");
							double markIn = sr.nextInt();
							String markInString = Double.toString(markIn);
							inputHistory.push(markInString);
							c.mark.setMark(markIn);
							st.courseList.add(c);
							System.out.println("Do you want to add more course? 1--> yes 2--> no ");
							int newCourse = sr.nextInt();
							String newCourseString = Integer.toString(newCourse);
							inputHistory.push(newCourseString);
							if (newCourse == 2) {
								courseLoop = false;

							}

						}
						t.studentList.add(st);
						System.out.println("Do you want to add more student? 1--> yes 2--> no ");
						int newStudent = sr.nextInt();
						String newStudentString = Integer.toString(newStudent);
						inputHistory.push(newStudentString);
						if (newStudent == 2) {
							studentLoop = false;

						}
					}
					d.teacherList.add(t);

					System.out.println("Do you want to add more teachers? 1--> yes 2--> no ");
					int select = sr.nextInt();
					String selectString = Integer.toString(select);
					inputHistory.push(selectString);
					if (select == 2) {
						condition = false;

					}

				}
				department11.add(d);
			}

			else if (input == 2) {
				System.out.println("School name " + school.getName());

				for (Department dep : department11) {
					System.out.println("Department name " + dep.getName());
					for (Teacher element : dep.teacherList) {

						System.out.println("Teacher name " + element.getName());
						for (Student stu : element.studentList) {
							System.out.println("Student name " + stu.getName());
							for (Course co : stu.courseList) {

								System.out.println("Course name " + co.getName());
								System.out.println(
										"Enter Mark is "  + co.mark.getMark());
							}
						}
					}

				}
			} 
			else if(input ==3) {
				for (String s : inputHistory) {
					System.out.println(s);
				}
		        try
		        {
		             
		            // Initializing BufferedWriter
		            BufferedWriter historyBuffer = new BufferedWriter(new FileWriter("history.txt"));

		            System.out.println("Buffered Writer start writing :)");

		            for(String x : inputHistory) {
		            	historyBuffer.write("\n"+x);
		            }
		            
		            historyBuffer.close();
		            System.out.println("This is the user input history");
		        }
		        catch (IOException except)
		        {
		            except.printStackTrace();
		        }
		 
		    }
			else if(input==4) {

				try {
			      BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\school\\history.txt")); //Creation of BufferedReader object
			      System.out.println("Enter the word you want to search ");
			      String searchWord = sr.next();
			      String s;
			      int count=0;
			     
			      while((s=br.readLine())!=null)   //Reading Content from the file
			      {
			           if (s.equals(searchWord))   //Search for the given word
			              {
			                   count++;    //If Present increase the count by one
			               }
			           
			          }
			      
			      if(count!=0)  //Check for count not equal to zero
			      {
			         System.out.println("The given word is present for "+count+ " Times in the file");
			      }
			      else
			      {
			         System.out.println("The given word is not present in the file");
			      }
			      
			      
			         br.close();
			   }
		        catch (IOException except)
		        {
		            except.printStackTrace();
		        }
			      
			}
			
			
			
		
			else {
				System.out.println("exit ");
				loop = false;

			}

		}
	}

}
