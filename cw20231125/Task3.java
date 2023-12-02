public class Task3{
	public static void main(String [] args){
		Task3 t = new Task3();
		int[] a = {1, -1, 7, -9};
		boolean negativeNumber = t.NegativeNumber(a);
		System.out.println(negativeNumber);
	}
	public boolean NegativeNumber(int[] a){
		int k = 0;
		for (int n : a){
			if (n < 0){
				k += 1;
				if (k == 2){
					return true;
				}
			}
		}
		return false;
	}
}