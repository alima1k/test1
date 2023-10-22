public class Task6b{
	public static void main(String[] args){
		String a = "AO";
		int s = 0;
		int i = 0;
		while ((s != -1) & (i < a.length())){	
			if (s == 0){
				if ((a.charAt(i) == 'A') | (a.charAt(i) == 'E') | (a.charAt(i) == 'Y') | (a.charAt(i) == 'U') | (a.charAt(i) == 'I') | (a.charAt(i) == 'O')){
					s = 1;
				}else{
					s = -1;
				}
			}else if (s == 1){
				if (i == a.length() - 1){
					if (((a.charAt(i) == 'A') | (a.charAt(i) == 'E') | (a.charAt(i) == 'Y') | (a.charAt(i) == 'U') | (a.charAt(i) == 'I') | (a.charAt(i) == 'O')) == false){
						s = -1;
					}
				}
			}
			i += 1;
		}
		System.out.println(s);
	}
}