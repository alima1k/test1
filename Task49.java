public class Task49{
	public static void main(String[] args){
		int n =1;
		double deg1 = -2;
		double deg2 = 3;
		double deg3 = 4;
		double deg4 = 9;
		double aold=0;
		double a = aold;
		do {
			aold = a;
			a = (deg1+deg2)/(deg3 + deg4);
			deg1 *= (-2);
			deg2 *= 3;
			deg3 *= (-2);
			deg4 *= 3;
		}
		while(Math.abs(a-aold)>1e-9);
		System.out.println(a);


	}
}