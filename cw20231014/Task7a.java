import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task7a{
	public static void main(String[] args){
		Pattern p = Pattern.compile("[A-Za-z_][A-Za-z0-9_]*");
		Matcher m = p.matcher("_lkchjHg98hH");
		System.out.println(m.matches());
	}
}