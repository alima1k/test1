import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task9a{
	public static void main(String[] args){
		Pattern p = Pattern.compile("[A-Za-z_][A-Za-z0-9_]* = [A-Za-z_][A-Za-z0-9_]* [+|///-|*|/] [A-Za-z_][A-Za-z0-9_]*|[A-Za-z_][A-Za-z0-9_]* = [1-9][0-9]* [+|-|*|/] [A-Za-z_][A-Za-z0-9_]*|[A-Za-z_][A-Za-z0-9_]* = [A-Za-z_][A-Za-z0-9_]* [+|-|*|/] [1-9][0-9]*|[A-Za-z_][A-Za-z0-9_]* = [1-9][0-9]* [+|-|*|/] [1-9][0-9]*");
		Matcher m = p.matcher("dhu8 = jhf - dfh");
		System.out.println(m.matches());
	}
}