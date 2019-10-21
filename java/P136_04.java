package Work;

public class TestInterface {
	public static void main(String[] args) {
		InterfaceA Capital = new Print();
		InterfaceB Letter_Lowercase = new Print();
		Capital.printCapitalLetter();
		Letter_Lowercase.printLowercaseLetter();
	}
}

/*=========================================================*/
package Work;

class Print implements InterfaceA, InterfaceB {
	public char Letter_Capital;
	public char Letter_Lowercase;

	public void printCapitalLetter() {
		System.out.println("--------大写字母表--------");
		for(Letter_Capital = 'A'; Letter_Capital <= 'Z' ; Letter_Capital++){
			System.out.print(Letter_Capital + " ");
		}
		System.out.println();
	}
	public void printLowercaseLetter() {
		System.out.println("--------小写字母表--------");
		for(Letter_Lowercase = 'a'; Letter_Lowercase <= 'z' ; Letter_Lowercase++){
			System.out.print(Letter_Lowercase + " ");
		}
		System.out.println();
	}
}

interface InterfaceA {
	void printCapitalLetter();
}

interface InterfaceB {
	void printLowercaseLetter();
}


