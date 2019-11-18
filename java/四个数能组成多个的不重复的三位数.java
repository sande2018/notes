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
