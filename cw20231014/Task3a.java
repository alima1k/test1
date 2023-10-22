import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task3a{
	public static void main(String[] args){
		Pattern p = Pattern.compile("[+]7-[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}");
		Matcher m = p.matcher("+7-698-000-00-00");
		System.out.println(m.matches());
	}
}