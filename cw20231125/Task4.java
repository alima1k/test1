import java.util.Scanner;
public class Task4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Task4 t = new Task4();
		String str = scan.nextLine().toLowerCase();
		boolean vowels = t.vowels(str);
		System.out.println(vowels);

	}
	public boolean vowels(String str){
		int count = 0;
		for (int i = 0; i < str.length(); i ++){
			if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'y') || (str.charAt(i) == 'u') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o')){
				count += 1;
			}
			if (count > 3){
				return false;
			}
		}
		if (count == 3){
			return true;
		}else{
			return false;
		}
	}
}