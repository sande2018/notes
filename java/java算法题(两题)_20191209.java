import java.util.Scanner;
	//求5位数的所有回文数
public class test1 {
	public static void main(String[] args) {
		long g,s,b,q,w,number;
		int num=0;
//		System.out.print("请输入一个五位数：");
//		Scanner sc = new Scanner(System.in);
//		number=sc.nextLong();
		for (int i = 10000; i < 100000; i++) {
			number=i;
			g=number%10;
			s=number%100/10;
			b=number/100%10;
			q=number/1000%10;
			w=number/10000;
			if (g==w && q==s) {
				num++;
				System.out.printf("【%3d】%5d  ",num,number);
				if (num%10==0) {
					System.out.println();
				}
//				System.out.println("是回文数");
			}else {
//				System.out.println("不是回文数");
			}
		}
		System.out.println("总个数："+num);
	}
}

---------------------------------------------------
public class test2 {
	//求100以内的素数
	public static void main(String[] args) {
		int i,j,num=0,max=100;
		L:for (i = 2; i <= max; i++) {
			for (j = 2; j < i; j++) {
				if (i%j==0) {
					continue L;
				}
			}
			if (j==i) {
				num++;
				System.out.printf("%4d",i);
				if (num%5==0) {
					System.out.println();
				}
			}
		}
		System.out.printf("\n%d以内的素数一共有%d个",max,num);
	}
}
