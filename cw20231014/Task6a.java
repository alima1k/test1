import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task6a{
	public static void main(String[] args){
		Pattern p = Pattern.compile("[EYUIOA].*[EYUIOA]");
		Matcher m = p.matcher("AsfgshO");
		System.out.println(m.matches());
	}
}