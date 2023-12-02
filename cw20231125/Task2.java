import java.util.Scanner;
public class Task2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Task2 t = new Task2();
		String vowel = "eyuioa";
		String str = scan.nextLine().toLowerCase();
		boolean vowels = t.vowels(str, vowel);
		System.out.println(vowels);

	}
	public boolean vowels(String str, String vowel){
		int k = 0;
		for (int i = 0; i < str.length(); i ++){
			if (('a' <= str.charAt(i)) && (str.charAt(i)) <= 'z'){
				for (int j = 0; j < vowel.length(); j ++){
					if (str.charAt(i) == vowel.charAt(j)){
						k = 1;
					}
				}
				if (k == 0){
					return false;
				}
			}
		}
		return true;
	}

}