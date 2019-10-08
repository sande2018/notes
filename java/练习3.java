package test;

public class Person {
	public String name="*空";
	public int age=0;
	public String school="*空";
	public String major="*空";
	
	public Person(String n,int a) {
		this.name = n;
		this.age = a;
	}
	public Person(String n,int a,String s) {
		this.name = n;
		this.age =a;
		this.school=s;
	}
	public Person(String n,int a,String s,String m) {
		this.name = n;
		this.age =a;
		this.school=s;
		this.major = m;
	}
	public String print_all() {
		return "姓名："+this.name+"   年龄："+this.age+"   学校："+this.school+"   专业："+this.major;
	}
	public static void main(String[] args) {
		Person test1 = new Person("小王",18);
		System.out.println(test1.print_all());
		Person test2 = new Person("小王",18,"华南商贸");
		System.out.println(test2.print_all());
		Person test3 = new Person("小王",18,"华南商贸","软件技术");
		System.out.println(test3.print_all());
	}
}
