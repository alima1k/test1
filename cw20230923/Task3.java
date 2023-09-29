public class Task3{
	public static void main (String [] args) {
		final double EPS = 1e-6;
		int n = 1;
		double aold=0;
		double a = aold;
		do{
			n += 1;
			aold = a;
			a= (n-1.0)/(2*n);

		}while (Math.abs(a-aold) > EPS);
		System.out.println(a);
	}

	
}