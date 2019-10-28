package P151_01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Demo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner a=new Scanner(System.in);
		int b[]= new int[5];
		System.out.println("请输入至少5个整数");
		try {
			for (int i = 0; i < 6; i++) {
				System.out.printf("请输入第%d个整数：",i+1);
				b[i]=a.nextInt();
			}
		} catch (InputMismatchException e) {
			System.out.printf("错误，请输入整数\n");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.printf("数组越界，程序退出\n");		
		}
	}
}
