package lap2;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		System.out.println();
		fibonacci(6);
	}

	private static void fibonacci(int n) {
	
		int ans = 0;
		int n2 = 1;
		int fibonacci;
		for (int j = 0; j < n; j++) {
			
			fibonacci = ans + n2;
			ans = n2;
			n2 = fibonacci;
			
		}
		
		System.out.println(ans);
		
	}

}
