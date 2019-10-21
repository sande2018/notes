package work;

public class Test {
	public static void main(String[] args) {
		Square a =new Square(2);
		Circle b =new Circle(3);
		System.out.printf("正方形的面积：%.2f\n",a.Area());
		System.out.printf("圆的面积：%.2f\n",b.Area());
	}
}

/*-------------------文件分割线-------------------*/

package work;

public interface Shape {
	double Area();
}

/*-------------------文件分割线-------------------*/
package work;

public class Circle implements Shape{
	public double r;
	public Circle(double r) {
		this.r = r;
	}
	public double Area() {
		return Math.PI*r*r;
	}
}

/*-------------------文件分割线-------------------*/
package work;

public class Square implements Shape{
	public double bian;
	public Square(double bian) {
		this.bian = bian;
	}
	public double Area() {
		return bian*bian;
	}
}
