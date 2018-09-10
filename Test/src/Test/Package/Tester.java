package Test.Package;

public class Tester {
 //TEESt
	
	public Tester() {
		// TODO Auto-generated constructor stub
		
		System.out.println(testMethod(2, 4));
		
	}
	
	public static int testMethod(int a, int b) {
		int min;
		
		if (a > b) {
			min = b;
		}else {
			min = a;
		}
		
		System.out.println("Es ging");
		
		return min;
	}
	
}
