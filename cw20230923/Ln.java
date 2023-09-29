public class Ln{
	public static void main(String [] args){
		final double EPS = 1e-9;
		double x = 1;
		double k = 1;
		double s = 0;
		double sign = 1;
		double deg = x;
		double fact = 1;
		double a = sign * deg / fact;
		while (Math.abs(a) > EPS){
			s = s + a;
			k+=1;
			sign = sign * (-1);
			deg *= x;
			fact *= k;
			a = sign * deg / fact;
		}
		System.out.println(s);
	}
}