import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task4a{
	public static void main(String[] args){
		Pattern p = Pattern.compile("1[5-8][0-9][0-9]|149[2-9]|19[0-5][0-9]|196[0-2]");
		Matcher m = p.matcher("1491");
		System.out.println(m.matches());
	}
}