import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task9{
	public static void main(String [] args){
		Task9 t = new Task9();
		String[][] a = {{"Atgd", "U", "jyu"},
						 {"Okj", "hg", "Ujhh"},
						 {"Eky", "jjl", "hkjbk"}};
		boolean capital = t.capital(a);
		System.out.println(capital);

	}
	public boolean capital(String[][] a){
		for (int j = 0; j < a[0].length; j ++){
			int count = 0;
        	for (int i = 0; i < a.length; i++) {
            	String str = a[i][j];
            	if (str.matches("^[AEIOU].*")) {
                	count++;
                	if (count > 2) {
                    	return false;
                	}
            	}
        	}	
    	}
    	return true;
    
	}

}