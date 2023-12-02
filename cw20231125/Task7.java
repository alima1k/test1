public class Task7{
	public static void main(String [] args){
		Task7 t = new Task7();
		String[][] a = {{"Atgd", "U", "Ojyu"}, {" kj", "hg", "oUjhh"}};
		boolean capital = t.capital(a);
		System.out.println(capital);

	}
	public boolean capital(String[][] a){
		for (int i = 0; i < a.length; i ++){
			if (vowels(a[i]) == false){
				return false;
			}
		}
		return true;
	}
	public boolean vowels(String[] a){
		for (int j = 0; j < a.length; j ++){
			if ((a[j].charAt(0) == 'A') || (a[j].charAt(0) == 'E') || (a[j].charAt(0) == 'Y') || (a[j].charAt(0) == 'U') || (a[j].charAt(0) == 'I') || (a[j].charAt(0) == 'O')){
				return true;
			}
		}
		return false;
		
	}	
}