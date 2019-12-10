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


---------------------------------------------------
public class test3 {
	//冒泡排序组合1
	public static void main(String[] args) {
		int i,j,n,k,w=0,ww=0,lastExchangeIndex=0;
		int a[] = new int[] {3,4,2,1,5,6,7,8};//新建数组
		n = a.length-1;//用于优化内存占用
		for (i = 0; i < a.length-1; i++) {
			boolean is=true;//用于优化内存占用
			//把大的数往后挪，每一轮确定一个最大的数
			w++;//外循环计数器
			for (j = 0; j < n; j++) {
				ww++;//内循环计数器
				if (a[j]>a[j+1]) {
					k=a[j];//k用于交换
					a[j]=a[j+1];
					a[j+1]=k;
					is=false;
					lastExchangeIndex = j;//记下最后一次调换的位置
				}
			}
			n=lastExchangeIndex;
			if (is) {
				break;
			}
		}
		System.out.printf("外循环执行了%d次,内循环执行了%d次\n",w,ww);
		for (int l = 0; l < a.length; l++) {
			System.out.print(a[l]+"  ");
		}
	}
}
---------------------------------------------------
public class test4 {
	//冒泡排列组合2
	public static void main(String[] args) {
		int k,w=0,ww=0;
		int a[] = new int[] {2,3,4,5,6,7,8,1};//新建数组
		for (int i = 0; i < a.length/2; i++) {
			boolean is=true;//用于优化内存占用
			//把大的数往后挪，每一轮确定一个最大的数
			w++;//外循环计数器
			for (int j = 0; j < a.length-1-i; j++) {
				ww++;//内循环计数器
				if (a[j]>a[j+1]) {
					k=a[j];//k用于交换
					a[j]=a[j+1];
					a[j+1]=k;
					is=false;
				}
			}
			if (is) {
				break;
			}
			for (int j = a.length-i-1; j >i; j--) {
				if (a[j]<a[j-1]) {
					k=a[j];//k用于交换
					a[j]=a[j-1];
					a[j-1]=k;
					is=false;
				}
			}
			if (is) {
				break;
			}
		}
		System.out.printf("外循环执行了%d次,内循环执行了%d次\n",w,ww);
		for (int l = 0; l < a.length; l++) {
			System.out.print(a[l]+"  ");
		}
	}
}
