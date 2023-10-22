import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1{
	public static void main(String[] args){
		Pattern p = Pattern.compile("[1-9][0-9]*");
		Matcher m = p.matcher("023");
		System.out.println(m.matches());
	}
}