public class Task7b{
	public static void main(String[] args){
		String a = "+_num_berFG45";
		int i = 0;
		int s = 0;
		while (( i < a.length()) & (s != -1)){
			if (s == 0){
				if ((a.charAt(i) >= 'a') & (a.charAt(i) <= 'z') | (a.charAt(i) >= 'A') & (a.charAt(i) <= 'Z') | (a.charAt(i) == '_')){
					s = 1;
				}else{
					s = -1;
				}
			}else if (s == 1){
				if ((a.charAt(i) >= 'a') & (a.charAt(i) <= 'z') | (a.charAt(i) >= 'A') & (a.charAt(i) <= 'Z') | (a.charAt(i) == '_') | (a.charAt(i) >= '0') & (a.charAt(i) <= '9')){
					s = 1;
				}else{
					s = -1;
				}

			}
			i += 1;
		}
		System.out.println(s);	
	}
}