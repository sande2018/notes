package homework;

import java.util.Arrays;
import java.util.Scanner;

public class P64_07 {

	public static void main(String[] args) {
		System.out.printf("【原数组】：");
		int[] data1 =new int[10];
		for (int i = 0; i < data1.length; i++) {
			data1[i]=(int) (Math.random()*20);
			System.out.print(data1[i]+"  ");
		}
		System.out.printf("\n【排序后】：");
		Arrays.sort(data1);
		for (int i = 0; i < data1.length; i++) {
			System.out.print(data1[i]+"  ");
		}
		System.out.printf("\n请输入一个数字：");
	    @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
		int b = -Arrays.binarySearch(data1, a);
		System.out.printf("【数字 %d 调整后在第 %d 位】\n【整理后】：",a,b);
		
		for (int i = 0; i < data1.length; i++) {
			if (i+1 == b)
			System.out.print(a+"  ");
			System.out.print(data1[i]+"  ");
		}
			if(a>=20)
			System.out.print(a+"  ");
	}
	

}
