public class Task2b{
	public static void main(String[] args){
		String a = "+0";
		int s = 0;
		int i = 0;
		while ((i < a.length()) & (s != -1)){
			if (s == 0){
				if ((a.charAt(i) == '-') | (a.charAt(i) == '+') ){
					s = 1;
				} else if (a.charAt(i) == '0'){
					s = 2;
				}
				else if ( (a.charAt(i) >= '1') & (a.charAt(i) <= '9')){
					s = 3;
				}
				else{
					s = -1;
				}
			}else if (s == 1){
				if ((a.charAt(i) >= '1') & (a.charAt(i) <= '9')){
					s = 3;
				}
				else{
					s = -1;
				}
			}
			else if ((s == 3)){
				if ((a.charAt(i) >= '0') & (a.charAt(i) <= '9')){
					s = 3;
				}
				else{
					s = -1;
				}
			}
			else if ( s == 2){
				s = -1;
			}
			i += 1;
		}
		System.out.println(s);
	}
}