public class Task8{
	public static void main(String [] args){
		Task8 t = new Task8();
		int[][] a = {{1, 468423, 6}, {398, 67, 84}};
		boolean evenNumber = t.evenNumber(a);
		System.out.println(evenNumber);
	}
	public boolean evenNumber(int[][] a){
		for (int i = 0; i < a.length; i ++){
			if (onlyEven(a[i]) == false){
				return false;
			}
		}
		return true;
	}
	public boolean onlyEven(int[] a){
		for (int i = 0; i < a.length; i ++){
			if (c(a[i])){
				return true;
			}
		}
		return false;
	}
	public boolean c(int n){
		while (n > 0){
			if (n % 2 != 0){
				return false;	
			}
			n = n / 10;
		}
		
		return true;
		
	}
}