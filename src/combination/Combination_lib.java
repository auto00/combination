package combination;

public class Combination_lib {
	private int s, r;


	
	
	public int getFactorial(int n) { //n�̊K����v�Z����
		int f = 1;
		//�K��v�Z
		
		while(n > 1) {
			f = n * f;
			n = n - 1;
		}
		
		return f;
		
	}

}
