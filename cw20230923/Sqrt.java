public class Sqrt{
	public static void main(String[] args){
		final double EPS = 1e-9;
		int eps = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[0]);
		double d = 1;
		double p = 0;
		for ( int i = 1; i <=eps+1; i++){
			while (p*p<= n ){
				p += d;

			}
			p -= d;
			d = d/10;
		}
		System.out.println(p);
		System.out.println(Math.sqrt(n));
	}
}
		