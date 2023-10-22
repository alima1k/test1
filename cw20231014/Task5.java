import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task5{
	public static void main(String[] args){
		String a = "asdAAAslep";
		int c = 0;
		char[] g={'a', 'e', 'y', 'u', 'i', 'o', 'A', 'E', 'Y', 'U', 'I', 'O'};
		for (int i = 0; i < a.length(); i ++){
			for (char x:g){
				if (a.charAt(i) == x){
					c += 1;
				}
			}
		}
		if (c > a.length() - c){
			System.out.println("There are more vowels in a line");
		}else if(c == a.length() - c){
			System.out.println("Vowels and consonants in a line equally");
		}else{
			System.out.println("There are more consonants in a line");
		}
	}
}