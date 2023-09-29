public class Cos{
	public static void main(String[] args){
		final double EPS = 1e-9;
		double x = Math.PI/6;
		int k = 0;
		int sign = 1;
		double fact = 1;
		double deg = 1;
		double s = 0;
		double a = (sign * deg) / fact;
		while (Math.abs(a)> EPS){
			s = s + a;
			k += 1;
			sign = (-1) * sign;
			deg *= x * x;
			fact *= (2 * k)*(2 * k - 1);
			a = (sign * deg) / fact;
		}
		System.out.println(s);
		System.out.println(Math.cos(x));
	}
}
