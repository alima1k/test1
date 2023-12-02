public class Task1{
	public static void main(String [] args){
		Task1 t = new Task1();
		int[] a = {1, -1, 7};
		boolean negativeNumber = t.NegativeNumber(a);
		System.out.println(negativeNumber);
	}
	public boolean NegativeNumber(int[] a){
		for (int n : a){
			if (n < 0){
				return true;
			}
		}
		return false;
	}
}