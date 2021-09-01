package lab1;

public class Gcd {

	
	public int gcdEuclidean(int a, int b) {
		//base case (mod == 0 then a is a multiple of b)
		if(b==0) return a;
		//a, b and mod have the same gcd, so we repeat for b and mod since mod is decreasing
		else return gcdEuclidean(b, a%b);
	}
	
	public int gcd(int a, int b) {
		int r;
		while(a%b>0) {
			r = a%b;
			a = b;
			b = r;
		}
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gcd gcd = new Gcd();
		System.out.println(gcd.gcdEuclidean(12,18));
		System.out.println(gcd.gcd(12,18));
	}

}
