-------------demo.java--------------------
package P151_7_2;

import java.util.Scanner;
import P151_7_2.triangle;;
public class demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		triangle w=new triangle();
		try {
			w.triangle(a, b, c);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
-------------triangle.java--------------------
package P151_7_2;

public class triangle extends demo{
	public void triangle(int a, int b, int c) throws Exception {
		if ( a+b>c && a+c>b && b+c>a) {
			System.out.println("可以组成三角形");
		} else {
			throw new Exception("不能组成三角形");
		}
	}
}

