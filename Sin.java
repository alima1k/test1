public class Sin{
	public static void main(String[] args){
		final double EPS = 1e-9;
		double x = Math.PI / 6;
		double k = 1;
		double s =0; 
		int fact =2; 
		double deg = x;
		int sign = 1;
		double a = sign * deg / fact;
		while (Math.abs(a) > EPS) {
			s+=a;
			k+=1;
			fact *= (2 * k -1) * (2*k );
			deg *= x * x;
			sign = -1 * sign;
			a = deg * sign/fact;
		}
		System.out.println(s);
		System.out.println(Math.sin(x));
		
	}
}
