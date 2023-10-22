public class Task4b{
	public static void main(String[] args){
		String a = "1692";
		int s = 0;
		int i = 0;
		while (( i < a.length()) & (s != -1)){
			if ( s == 0){
				if (a.charAt(i) == '1'){
					s = 1;
				}
				else{
					s = -1;
				}
			}else if (s == 1){
				if (a.charAt(i) == '4'){
					s = 2;
				}
				else if (( a.charAt(i) >= '5') & ( a.charAt(i) <= '8')){
					s = 3;
				}
				else if ( a.charAt(i) == '9'){
					s = 4;
				}
				else{
					s = -1;
				}
			
			}
			else if (s == 2){
				if (a.charAt(i) == '9'){
					s = 5;
				}else{
					s = -1;
				}
			
			}
			else if (s == 3){
				if (( a.charAt(i) >= '0') & ( a.charAt(i) <= '9')){
					s = 3;
				}else {
					s = -1;
				}
			}
			else if (s == 4){
				if ((a.charAt(i) <= '5') & (a.charAt(i) >= '0')){
					s = 3;
				}else if (a.charAt(i) == '6'){
					s = 6;
				} 
				else{
					s = -1;
				}
			}
			else if (s == 5){
				if ((a.charAt(i) >= '2') & (a.charAt(i)<= '9')){
					s = 7;
				}else{
					s = -1;
				}
			}else if (s == 6){
				if ((a.charAt(i) >= '0') & (a.charAt(i) <= '2')){
					s = 7;
				}else{
					s = -1;
				}
			}
			i += 1;
		}
		System.out.println(s);
	}
}