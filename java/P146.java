package Demo_01;

public class Try5 {
	public void run(int k) {
		long y=1,i=1;
		System.out.print(k+"!=");
		for (int j = k; j >= 1; j--) {
			if (j==k) {
				System.out.print(j);
			}else {
				System.out.print("*"+j);
			}
		}
		for (i = 1; i <=k; i++) {
			try {
				if(y>Long.MAX_VALUE/i)
					throw new Exception("overflow");
				else 
					y=y*i;
			} catch (Exception e) {
				System.out.println("exception:"+e.getMessage());
				e.printStackTrace();
				System.exit(0);
			}
		}
		System.out.println("="+y);
	}
	
	public static void main(String[] args) {
		Try5 a=new Try5();
		for (int i = 1; i <= 20; i++) {
			a.run(i);
		}
	}
}
