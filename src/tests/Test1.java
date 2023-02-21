package tests;
import selenium.Test4;

public class Test1 {
	
	// ClassName ObjName = new ClassName();
	static Test1 t1 = new Test1();// used for calling non static method in main
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
    public static void main(String[] args) {
		
		System.out.println("I'm in main method");
		scanMe();
	 	printMe();
		System.out.println("After Print Me");
		t1.testMe();
		t1.paintMe();
		Test2.blue();
		t2.red();
		//5. call square
		t3.square();
		
		//6. call circle
		Test3.circle();
		
		//import method from a different package
		Test4.abc();
		t4.xyz();
		
	}
	
	public static void scanMe() {
		System.out.println("scanMe");
	}
	
	public static void printMe() {
		System.out.println("PrintMe");
	}
	public  void testMe() {
		System.out.println("testMe");
	}
	public void paintMe() {
		System.out.println("paintMe"); //non static method 
	}

}
