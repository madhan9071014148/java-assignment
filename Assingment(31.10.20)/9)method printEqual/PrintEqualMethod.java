package printequalmethod;

public class PrintEqualMethod {
	public  void printEqual(int a,int b,int c) {
		if(a<0||b<0||c<0) {
			System.out.println("Invalid Value");
		}
		else if ((a==b)&&(b==c)&&(c==a)){
			System.out.println("All numbers are equal");
		}
		else {
			System.out.println("All numbers are different");
		}
	}
	public static void main(String[] args) {
		int a=-1,b=10,c=10;
		PrintEqualMethod equalMethod=new PrintEqualMethod();
		equalMethod.printEqual(a, b, c);
	
	}

}
