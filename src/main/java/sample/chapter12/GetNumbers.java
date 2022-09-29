package sample.chapter12;

/**
 * Working with Return Values
 * @author leosun
 *
 */
public class GetNumbers {
	
	public static void main(String[] args) {
		
		get2();
		
		int num = get3();
		System.out.println(num);
		
		System.out.println(get4());
	}
	
	public static int get2() {
		return 2;
	}
	
	public static int get3() {
		return 3;
	}
	
	public static int get4() {
		return 4;
	}
}
