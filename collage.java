package universityManagement;
import java.util.Scanner;

class Clg extends uni_name{
	
	public String collage_name;
	private int register_no;
	private String collage_address;
	private String field;
	public int total_students;
	private String cherman_name;
	private String principal;
	public int total_teacher;
	
	Scanner sc =new Scanner(System.in);
	
	public void getCollage() {
		System.out.println("Collage name :\t"+collage_name);
		System.out.println("Collage Regiser Number :\t"+register_no);
		System.out.println("Collage address:\t"+collage_address);
		System.out.println("Collage University :\t"+ University_name);
		System.out.println("Fields in collage :\t"+field);
		System.out.println("Total Student:\t"+total_students);
		System.out.println("Cheareman Name :\t"+cherman_name);
		System.out.println("Principa name :\t"+principal);
		System.out.println("Total Teachers :\t"+total_teacher);
	}
	public void setCollage() {
		System.out.println("Collage name : ");
		collage_name=sc.nextLine();
		System.out.println("Collage Regiser Number : ");
		register_no=sc.nextInt();
		System.out.println("Collage address: ");
		collage_address=sc.nextLine();
		sc.next();
		System.out.println("Having Fiels(Cource) : ");
		field=sc.nextLine();
		sc.nextLine();
		System.out.println("Cheareman Name : ");
		cherman_name=sc.nextLine();
		sc.nextLine();
		System.out.println("PrincipaL name : ");
		principal=sc.nextLine();
		sc.nextLine();
		System.out.println("Total Student: ");
		total_students=sc.nextInt();
		System.out.println("Total Teachers : ");
		total_teacher=sc.nextInt();
	}
}
class Student extends Clg{
	private String Std_name;
	private int Id;
	public String clg_name;
	private String Class;
	private int roll_no;
	private int register_no;
	private String address;
	private String  field;
	
	public void getStudent() {
		System.out.println("Student Name : "+Std_name);
		System.out.println("Student ID : "+Id);
		System.out.println("University : "+University_name);
		System.out.println("Collage  Name:"+clg_name);
		System.out.println("Student class : "+Class);
		System.out.println("Student Roll Number : "+roll_no);
		System.out.println("Register Number : "+register_no);
		System.out.println("Address : "+address);
		System.out.println("field : "+field);
	}
	public void setStudent() {
		System.out.println("Student Name : ");
		Std_name=sc.next();
		System.out.println("Student ID : ");
		Id=sc.nextInt();
		System.out.println("Collage  Name:");
		clg_name=sc.next();
		System.out.println("Student class : ");
		Class=sc.next();
		System.out.println("Student Roll Number : ");
		roll_no=sc.nextInt();
		System.out.println("Register Number : ");
		register_no=sc.nextInt();
		System.out.println("Address : ");
		address=sc.next();
		System.out.println("field : ");
		field=sc.nextLine();
		total_students++;
	}
}
class Teacher extends Clg{
	String teacher_name;
	public String clg_name;
	String qualification;
	int age;
	double salary;
	String address;
	public void getTeacher() {
		System.out.println("Teacher name : "+teacher_name);
		System.out.println("Collage  Name:"+clg_name);
		System.out.println("University : "+University_name);
		System.out.println("Qualification : "+qualification);
		System.out.println("Age : "+age);
		System.out.println("Month Salary : "+salary);
		System.out.println("Address : "+address);
	}
	public void setTeacher() {
		System.out.println("teacher name : ");
		teacher_name=sc.next();
		System.out.println("Collage  Name:");
		clg_name=sc.next();
		System.out.println("Qualification : ");
		qualification=sc.next();
		System.out.println("Age : ");
		age=sc.nextInt();
		System.out.println("Month Salary : ");
		salary=sc.nextDouble();
		System.out.println("Address : ");
		address=sc.next();
		total_teacher++;
	}
}
public class collage extends Teacher{
	public static void main(String[] args) {
		Clg collage[]=new Clg[5];
		Student student[]=new Student[5];
		Teacher teacher[]=new Teacher[5];
		int collage_counter=0;
		int student_counter=0;
		int teacher_counter=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("==================== UNIVERSITY OF MUMBAI =======================");
		System.out.println();
		while(true) {
		System.out.println("1].Add Collage\t\t2].Add Student\t\t3].Add Teacher");
		System.out.println();
		System.out.println("4].Show Collage\t\t5].Show Student\t\t6].Show Teacher");
		System.out.println();
		System.out.println("Enter your choice : ");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			collage[collage_counter]=new Clg();
			collage[collage_counter].setCollage();
			collage_counter++;
			System.out.println();
//			choice=sc.nextInt();
			break;
		case 2:
			student[student_counter]=new Student();
			student[student_counter].setStudent();
			student_counter++;
			System.out.println();
			
			break;
		case 3:
			teacher[teacher_counter]=new Teacher();
			teacher[teacher_counter].setTeacher();
			student_counter++;
			System.out.println();
			break;
		case 4:
			
			for (int i = 0; i < collage_counter; i++) {
				
				collage[i].getCollage();
				System.out.println();
				System.out.println();
			}
			break;
		case 5:
			System.out.println("Enter collage name : ");
			String clg=sc.next();
			Student s=new Student();
			for (int i = 0; i < student_counter; i++) {
				if(clg.equals(student[i].clg_name)) {
					student[i].getStudent();
				}
				System.out.println();
				System.out.println();
			}
			break;
		case 6:
			System.out.println("Enter collage name : ");
			String clg1=sc.next();
			Teacher t=new Teacher();
			for (int i = 0; i < teacher_counter; i++) {
				if(clg1.equals(teacher[i].clg_name)) {
					teacher[i].getTeacher();
				}
				else {
					System.out.println("Teacher Not Found");
				}
				System.out.println();
				System.out.println();
			}
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		}	
	}
}




















