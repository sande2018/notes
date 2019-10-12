package work;
import work.Manager;

import org.omg.CORBA.PUBLIC_MEMBER;

import work.CommonEmployee;
public abstract class Employee {
	public static void main(String[] args) {
		 work();
	}

	private static void work() {
		Manager a1=new Manager("猪猪侠", "A01",1500.50,500.00);
		CommonEmployee a2=new CommonEmployee("蜘蛛侠","A02",1100.00);
		System.out.println(a1.console_log());
		System.out.println(a2.console_log());
	}

	
}








package work;
public class Manager {
	private String name;
	private String id;
	private double salary;
	private double bonus;
	public Manager(String name,String id,double salary,double bonus) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.bonus=bonus;
	}
	public String console_log() {
		return "姓名："+name+"(经理)     工号："+id+"  工资："+salary+"   奖金："+bonus;
	}
	
}










package work;
public class CommonEmployee {
	private String name;
	private String id;
	private double salary;
	public CommonEmployee(String name,String id,double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String console_log() {
		return "姓名："+name+"(普工)    工号："+id+"  工资："+salary;
	}
}

