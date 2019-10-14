package wok;
import wok.Car;
import wok.Truck;
import wok.Vehicle;;

public abstract class test {
	
	public static void main(String[] args) {
		Vehicle a1=new Vehicle("A001","Truck",53.50);
		Vehicle a2=new Vehicle("A002","Car",85.50);
		Truck a3=new Truck();
		Car a4=new Car();
		
		System.out.println(a1.getinformation()+a3.getToll(a1._distance));
		System.out.println(a2.getinformation()+a4.getToll(a2._distance));
		
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

public class Truck {
	public double _price=0.38;

	public String getToll(double _distance) {
		double al =_price*_distance;
		return "  单价：" + _price +"  高速费用："+ al;
	}

}










package wok;

public class Car {
	public double _price=0.28;
	
	public String getToll(double _distance){
		double al =_price*_distance;
		return "  单价：" + _price +"  高速费用："+ al;
	}


}
