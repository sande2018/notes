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
		return "������"+name+"(�չ�)    ���ţ�"+id+"  ���ʣ�"+salary;
	}
}

