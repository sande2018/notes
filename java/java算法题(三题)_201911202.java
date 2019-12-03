import java.util.Scanner;

public class Demo_01 {
	//1、输入2个正整数，求其最大公约数和最小公倍数
	public static void main(String[] args) {
		int a,b,c,d,temp,r,n;
		Scanner input=new Scanner(System.in);
		System.out.print("请输入2个正整数（用空格隔开）：");
		a=c=input.nextInt();
		b=d=input.nextInt();
		if (a<b) {
			temp=b;
			b=a;
			a=temp;
		}
		r=a%b;
		n=a*b;
		while (r!=0) {
			a=b;
			b=r;
			r=a%b;
		}
		System.out.printf("%d和%d的最大公约数是%d,最小公倍数是%d\n",c,d,b,n/b);
	}
}


-------------------------------------------------------------------
public class Demo_02 {
	//2、一个数如果恰好等于它的因子之和，这个数就被称为“完数”，例如6=1+2+3，找出1000以内的所有完数。
	public static void main(String[] args) {
		int i,j,sum=0,k=0;
		int a[]=new int[50];
		for (i = 2; i <=1000; i++) {
			sum=a[0]=1;
			for (j = 2; j < i; j++) {
				if (i%j==0) {
					a[++k]=j;
					sum+=j;
				}
			}
			if (sum==i) {
				System.out.println(sum);
			}
			k=0;
		}
	}
}

-------------------------------------------------------------------
public class Demo_03 {
	/*一个球从100米处自由下落，每次落地后反弹回原来高度的一半，再落下，求在第十次落地时，共经过多少米？第十次反弹多高？*/
	public static void main(String[] args) {
		double m=100.000000,sum=100.000000;
		int i;
		m/=2;
		sum+=m*2;
		for (i=2; i < 11; i++) {
			if(i!=10) {
				sum+=m;	
			}
			m=(m/2);
		}
		System.out.printf("在第十次落地时，共经过%.6f米,第十次反弹%.6f米\n",sum,m);
	}
}
