
public class Demo_01 {
	/*有一对兔子，从出生后第三个月起每个月生一对兔子，
	 小兔子长到第三个月后每个月又生一对兔子，假如兔子不死，
	 问每个月兔子的总数多少，输出前40个月就行*/
	public static void main(String[] args) {
		int i,n1=1,n2=1;
		for(i=1;i<=20;i++) {
			System.out.printf("%-12d%-12d",n1,n2);
			n1=n1+n2;
			n2=n1+n2;
			if(i%4==0) {
				System.out.println();
			}
		}
	}
}

		
-----------------------------------------------------

public class Demo_02 {
	/*判断101----200之间的素数，并输出*/
	public static void main(String[] args) {
		int i,j,n=0;
		for (i = 101; i <= 200; i++) {
			for (j = 2; j < i; j++) {
				if (i%j==0) {
					break;
				}
			}
			if (j>=i) {
				n++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("一共有"+n+"个素数");
	}
}

-----------------------------------------------------
public class Demo_03 {
	/*打印所有的水仙花数，指的是一个三位数，每位数字的立方和等于其本身*/
	public static void main(String[] args) {
		int a,b,c;
		for (int i = 100; i < 1000; i++) {
			//取百位
			a=i/100;
			//取十位
			b=(i-a*100)/10;
			//取各位
			c=i-a*100-b*10;
			if (a*a*a+b*b*b+c*c*c==i) {
				System.out.print(i+" ");
			}
		}
	}
}


-----------------------------------------------------
import java.util.Scanner;

public class Demo_04 {
	/*将一个正整数分解质因素。*/
	public static void main(String[] args) {
		int a,b,j;
		Scanner num=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		a=num.nextInt();
		b=a;
		for (;;) {
			for (j = 2; j < b; j++) {
				if (b%j==0) {
					break;
				}
			}
			b=b/j;
			System.out.println(j);
			if (b==1) {
				break;
			}
		}
		
	}
}
