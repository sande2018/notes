package demo_01;

import java.util.Scanner;

public class exampleTwo {
	private static String telNumber=null;
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.print("请输入11位手机号码：");
			String telNumber=scanner.next();
			if (telNumber.length()!=11) {
				throw new Exception("手机号码长度不正确");
			}else {
				char[] numChar=telNumber.toCharArray();
				for(int i=0;i<numChar.length;i++) {
					if (numChar[i]<48 || numChar[i]>57) {
						throw new Exception("手机号中存在非法字符");
					}
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
