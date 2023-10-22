public class Task1a{
	public static void main(String[] args){
		String a = "123";
		int s = 0;
		int i = 0;
		while (( i < a.length()) & (s != -1)){
			if (s == 0){
				if (('1' <= a.charAt(i)) & (a.charAt(i) <= '9')){
					s = 1;
				}
				else{
					s = -1;
				}
			}else if (s == 1){
				if (('0' <= a.charAt(i)) & ( a.charAt(i) <= '9')){
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