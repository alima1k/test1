public class Task1{
	public static void main(String[] args){
		final double EPS = 1e-9;
		double n = 0;
		double aold = 0;
		double a = aold;
		do{
			 n +=1;
			 aold = a;
			 a =  10000*n/(n*n+1);

		}
		while (Math.abs(a-aold) > EPS);
		System.out.println(a);

		
	

		

	}
}