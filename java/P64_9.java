package homework;

import java.util.Scanner;

public class p64_9 {
	public int id;
	public String name;
	public float score;
	public p64_9(int a,String b,float c) {
		this.id=a;
		this.name=b;
		this.score=c;
	}
	public String printout() {
		return "学号："+id+"  姓名："+name+"  分数："+score;
	}
	public static void main(String[] args) {
		p64_9[] setData= new p64_9[2];
		for (int i = 0; i < setData.length; i++) {
			Scanner s=new Scanner(System.in);
			System.out.printf("--【正在录入第 %d 个同学的信息】--\n",i+1);
			System.out.printf("请录入学号：");
			int a =s.nextInt();
			System.out.printf("请录入姓名：");
			s.nextLine();
			String b=s.nextLine();
			System.out.printf("请录入分数：");
			float c=s.nextFloat();
			setData[i] = new p64_9(a,b,c);
		}
		System.out.println("---数据已保存，正在输出---");
		for (int i = 0; i < setData.length; i++) {
			System.out.println(setData[i].printout());
		}
	}
}
