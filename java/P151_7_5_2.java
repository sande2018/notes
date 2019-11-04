-----------UserExceptionDemo.java---------------------
package P151_7_5_2;

import P151_7_5_2.Member;;;

public class UserExceptionDemo {

	
	public static void main(String[] args) {
		try {
			Member a1 = new Member("李明","male",300,0,200);
			if(a1.getBalance() <=0)
				throw new BalancelnsufficeientException("余额不足");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}

-----------BalancelnsufficeientException.java---------------------
package P151_7_5_2;

public class BalancelnsufficeientException extends Exception {
	public BalancelnsufficeientException(String msg) {
		super(msg);
	}
}


-----------Member.java---------------------
package P151_7_5_2;

public class Member {
	public static String name;
	public static String sex;
	public static double c;
	public static double Balance;
	public static double e;
	Member(String name,String sex,double c,double Balance,double e) {
		this.name = name;
		this.sex = sex;
		this.c = c;
		this.Balance = Balance;
		this.e = e;
	}
	public double getBalance() {
		return Balance;
	}
	public char[] getMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}
