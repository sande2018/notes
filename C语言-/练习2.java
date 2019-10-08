package test;

public class demo_01 {

	public static void main(String[] args) {
		Circle c1=new Circle(7.711);
		Triangle t1=new Triangle(7.111,7.711,7.711);
		System.out.printf("一个半径为 %.3f米的圆，其面积为：%.2f平方米\n\n",c1.get_a(),c1.getArea());
		System.out.printf("一个三边为 %s米的三角形，其面积为：%.2f平方米\n",t1.get_a(),t1.getArea());
	}

}














package test;

public class Circle {
	public double a;
	public Circle(double a) {
		this.a =a;
	}
	public double getArea() {
		return a*a*3.14;
	}
	public double get_a() {
		return this.a;
	}
}













package test;

public class Triangle {
	public double d,e,f;
	public double s,q;
	public Triangle(double d, double e, double f) {
		this.d = d;
		this.e = e;
		this.f = f;
	}
	public String get_a() {
		return this.d+","+this.e+","+this.f;
	}
	public double getArea() {
		this.s=(d+e+f)/2;
		this.q=(s-d)*(s-e)*(s-f);
		return Math.sqrt(s*q);
	}
}
