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
		return "������"+name+"(����)     ���ţ�"+id+"  ���ʣ�"+salary+"   ����"+bonus;
	}
	
}
