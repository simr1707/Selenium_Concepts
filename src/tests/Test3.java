package tests;

public class Test3 {
	static Test3 t3 = new Test3();
	static Test1 t1 = new Test1();

	public static void main(String[] args) {
		//3. call square
		circle();
		
		//4. call circle
		t3.square();
		
		//7. call printMe
		Test1.printMe();
		
		//8. call testMe
		t1.testMe();

	}
	
	//1. create static circle 
	public static void circle() {
		System.out.println("circle");
	}
	
	//2. create non static square
	public void square() {
		System.out.println("square");
	}
	
}
