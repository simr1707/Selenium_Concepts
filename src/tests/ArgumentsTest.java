package tests;

public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum(6,7);
		sum(10,11);
		sum(20,25);
		sum(1,2,3);
		sum(100,1000,2000);

	}
	
	public static void sum() {
		int a = 4+5;
		System.out.println(a);
	}

	public static void sum(int b, int c) {
		int a = b+c;
		System.out.println(a);
	}
	
	public static void sum(int b, int c, int d) {
		int a = b+c+d;
		System.out.println(a);
	}
}
