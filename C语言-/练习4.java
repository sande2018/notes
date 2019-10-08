package test;
import test.Student;
public class Student_main {
	public static void main(String[] args) {
		Student[] a=new Student[5];
		a[1]=new Student("张三",20);
		System.out.printf("[%s]的班主任是[%s]\n",a[1].name,a[1].teacher);
	}
}


package test;

public class Student {
	public String name;
	public int age;
	public static String teacher="王老师";
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}

}
