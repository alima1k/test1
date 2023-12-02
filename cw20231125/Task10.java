public class Task10{
	public static void main(String [] args){
		Task10 t = new Task10();
		int[][] a = {{864, 14684, 16, 84244, 35}, {6428, 2, 398, 67, 84}};
		boolean evenNumber = t.evenNumber(a);
		System.out.println(evenNumber);
	}
	public boolean evenNumber(int[][] a){
		int count = 0;
		for (int i = 0; i < a.length; i ++){
			if (onlyEven(a[i]) == false){
				return false;
			}
		}
		return true;
	}
	public boolean onlyEven(int[] a){
		int count = 0;
		for (int i = 0; i < a.length; i ++){
			if (c(a[i])){
				count += 1;
				if (count == 3){
					return true;
				}
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