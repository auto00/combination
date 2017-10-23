package combination;

public class Combination_lib {
	private int s, r;


	
	
	public int getFactorial(int n) { //n‚ÌŠKæ‚ğŒvZ‚·‚é
		int f = 1;
		//ŠKæŒvZ
		
		while(n > 1) {
			f = n * f;
			n = n - 1;
		}
		
		return f;
		
	}

}
