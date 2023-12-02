public class Task6{
	public static void main(String [] args){
		Task6 t = new Task6();
		int[][] a = {{1, 4, 6}, {3, 6, 8}};
		boolean threeNumber = t.threeNumber(a);
		System.out.println(threeNumber);

	}
	public boolean threeNumber(int[][] a){
		for (int i = 0; i < a.length; i ++){
			if (three(a[i])){
				return true;
			}
		}
		return false;
	}
	public boolean three(int[] a){
		for (int j = 0; j < a.length; j ++){
			if (a[j] % 3 != 0){
				return false;
			}		
		}
		return true;
	}	
}