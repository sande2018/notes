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

