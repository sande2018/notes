package wok;
import wok.Car;
import wok.Truck;
public class test {
	
	public static void main(String[] args) {
		Truck a3=new Truck("A001","Truck",53.50);
		Car a4=new Car("A002","Car",85.50);
		System.out.printf("%s%s\n",a3.getinformation(),a3.getToll(a3._distance));
		System.out.printf("%s%s\n",a4.getinformation(),a4.getToll(a4._distance));
		
	}
}









package wok;

public class Vehicle {
	public String _ID;/*车牌*/
	public String _type;/*车型*/
	public double _distance;/*公里数*/
	public Vehicle(String _ID,String _type,double _distance){
		this._ID = _ID;
		this._type=_type;
		this._distance=_distance;
	}
	public String getinformation() {
		return "车牌："+_ID+ "  车型："+_type+ "  公里数："+_distance;
	}
}





package wok;

public class Truck extends Vehicle{
	public Truck(String _ID, String _type, double _distance) {
		super(_ID, _type, _distance);
		
	}

	public double _price=0.38;

	public String getToll(double _distance) {
		double al =_price*_distance;
		return "  单价：" + _price +"  高速费用："+ al;
	}

}






package wok;

public class Car extends Vehicle{
	public Car(String _ID, String _type, double _distance) {
		super(_ID, _type, _distance);
	}

	public double _price=0.28;
	
	public String getToll(double _distance){
		double al =_price*_distance;
		return "  单价：" + _price +"  高速费用："+ al;
	}


}
