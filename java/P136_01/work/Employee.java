package work;
import work.Manager;

import org.omg.CORBA.PUBLIC_MEMBER;

import work.CommonEmployee;
public abstract class Employee {
	public static void main(String[] args) {
		 work();
	}

	private static void work() {
		Manager a1=new Manager("÷Ì÷Ìœ¿", "A01",1500.50,500.00);
		CommonEmployee a2=new CommonEmployee("÷©÷Îœ¿","A02",1100.00);
		System.out.println(a1.console_log());
		System.out.println(a2.console_log());
	}

	
}
