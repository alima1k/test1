import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task2a{
	public static void main(String[] args){
		Pattern p = Pattern.compile("([+|-]?[1-9][0-9]*)|[0]");
		Matcher m = p.matcher("-0");
		System.out.println(m.matches());
	}
}