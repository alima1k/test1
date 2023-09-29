public class Task2{
	public static void main (String [] args) {
		final double EPS = 1e-9;
		int n = 1;
		double aold=0;
		double a = aold;
		do{
			n += 1;
			aold = a;
			a= Math.sqrt(n+1) - Math.sqrt(n);

		}while (Math.abs(a-aold) > EPS);
		System.out.println(a);
	}

	
}