public class Task5{
	public static void main(String [] args){
		Task5 t = new Task5();
		int[] a = {41, -1, 7, -9};
		boolean positiveNumber = t.PositiveNumber(a);
		System.out.println(positiveNumber);
	}
	public boolean PositiveNumber(int[] a){
		for (int n : a){
			if (n > 0){
				if (c(n) == false){
					return false;
				}
			}
		}
		
		return true;
		
	}
	public boolean c(int n){
		while (n > 0){
			if (n % 2 == 0){
				return true;	
			}
			n = n / 10;
		}
		
		return false;
		
	}
}