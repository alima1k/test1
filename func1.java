public class func1{
	public static void main(String[] args){
		final double EPS = 1e-9;
		double s = 0;
		double k = 0;
		int fact = 1;
		int x = 1;
		double deg = 1;
		double a = deg/fact;
		while (Math.abs(a) > EPS) {
			s+=a;
			k+=1;
			fact *= k;
			deg *= x;
			a = deg/fact;
		}
		System.out.println(s);
		
	}
}