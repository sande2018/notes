package Demo_01;

public class Demo_01 {
	public static void main(String[] args) {
		/*有1，2，3，4四个数，能组成多少个不相同且无重复数字的三位数？*/
		int i,j,k,count=0;
		for (i = 1; i < 5; i++) {
			for (j = 1; j < 5; j++) {
				for (k = 1; k < 5; k++) {
					if (i!=j && i!=k && j!=k) {
						count++;
						System.out.printf("第%d组 %d %d %d\n",count,i,j,k);
					}
				}
			}
		}
			System.out.printf("一共有%d组\n",count);
	}

}

--------------------------------------------------------------
package Demo_02;

import java.util.Scanner;

public class Demo_02 {
	/*输入某年某月某日，判断这一天是这一年的第几天？*/
	public static void main(String[] args) {
		int datetime[]=new int[3];
		int day=0,month;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入 年:");
		datetime[0]=sc.nextInt();
		System.out.print("请输入 月:");
		datetime[1]=sc.nextInt();
		System.out.print("请输入 日:");
		datetime[2]=sc.nextInt();
		for (int i = 1; i < datetime[1]+1; i++) {
			if (i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
				 day+=31;
			}else if(i==2){
				if (datetime[0]%4==0 && datetime[0]%100==0) {
					day+=28;
				}else {
					day+=29;
				}
			}else {
				day+=30;
			}
		}
		
	}

}
	
--------------------------------------------------------------
package Demo_03;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_03 {
	/*输入xyz三个整数，请把这三个数从小到大输出。*/
	public static void main(String[] args) {
		int num[]=new int[3];
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入x值：");
		num[0] = sc.nextInt();
		System.out.print("请输入y值：");
		num[1] = sc.nextInt();
		System.out.print("请输入z值：");
		num[2] = sc.nextInt();
		Arrays.sort(num);
		System.out.print("从小到大排列：");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d ",num[i]);
		}
	}
}

--------------------------------------------------------------
package Demo_04;

public class Demo_04 {
	/*输出9*9口诀*/
	public static void main(String[] args) {
		int x,y=0;
		for (x = 1; x < 10; x++) {
			for (y = 1; y <= x; y++) {
				System.out.printf("%d×%d=%d ",x,y,x*y);
			}
			System.out.println();
		}
	}
}
