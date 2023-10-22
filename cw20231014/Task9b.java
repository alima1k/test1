public class Task9b{
	public static void main(String[] args){
		String a = "h = 10 - hJHGj_";
		int i = 0;
		int s = 0;
		while (( i < a.length()) & ( s != -1)){
			if (s == 0){
				if (( a.charAt(i) >= 'a') & (a.charAt(i) <= 'z') | ( a.charAt(i) >= 'A') & (a.charAt(i) <= 'Z') | a.charAt(i) == '_'){
					s = 1;
				}else{
					s = -1;
				}
			}else if (s == 1){
				if (( a.charAt(i) >= 'a') & (a.charAt(i) <= 'z') | ( a.charAt(i) >= 'A') & (a.charAt(i) <= 'Z') | (a.charAt(i) == '_') | ( a.charAt(i) >= '0') & (a.charAt(i) <= '9')){
					s = 1;
				}else if (a.charAt(i) == ' '){
					s = 2;
				}else{
					s = -1;
				}
			}else if (s == 2){
				if (a.charAt(i) == '='){
					s = 3;
				}else{
					s = -1;
				}
			}else if (s == 3){
				if (a.charAt(i) == ' '){
					s = 4;
				}else{
					s = -1;
				}
			}else if (s == 4){
				if ((a.charAt(i) >= 'a') & (a.charAt(i) <= 'z') | (a.charAt(i) >= 'A') & (a.charAt(i) <= 'Z') | (a.charAt(i) == '_')){
					s = 5;
				}else if ((a.charAt(i) >= '1') & (a.charAt(i) <= '9')){
					s = 6;
				}else{
					s = -1;
				}
			}else if (s == 5){
				if (( a.charAt(i) >= 'a') & (a.charAt(i) <= 'z') | ( a.charAt(i) >= 'A') & (a.charAt(i) <= 'Z') | (a.charAt(i) == '_') | ( a.charAt(i) >= '0') & (a.charAt(i) <= '9')){
					s = 5;
				}else if (a.charAt(i) == ' '){
					s = 7;
				}else{
					s = -1;
				}
			}else if (s == 6){
				if ((a.charAt(i) >= '0') & (a.charAt(i) <= '9')){
					s = 6;
				}else if (a.charAt(i) == ' '){
					s = 7;
				}else{
					s = -1;
				}
			}else if (s == 7){
				if ((a.charAt(i) == '+') | (a.charAt(i) == '-') | (a.charAt(i) == '*') | (a.charAt(i) == '/')){ 
					s = 8;
				}else{
					s = -1;
				}	
			}else if (s == 8){
				if (a.charAt(i) == ' '){
					s = 9;
				}else{
					s = -1;
				}
			}else if (s == 9){
				if ((( a.charAt(i) >= 'a') & (a.charAt(i) <= 'z') | ( a.charAt(i) >= 'A') & (a.charAt(i) <= 'Z') | a.charAt(i) == '_')){
					s = 10;
				}else if ((a.charAt(i) >= '1') & (a.charAt(i) <= '9')){
					s = 11;
				}else{
					s = -1;
				}
			}else if (s == 10){
				if (( a.charAt(i) >= 'a') & (a.charAt(i) <= 'z') | ( a.charAt(i) >= 'A') & (a.charAt(i) <= 'Z') | (a.charAt(i) == '_') | ( a.charAt(i) >= '0') & (a.charAt(i) <= '9')){
					s = 10;
				}else{
					s = -1;
				}
			}else if (s == 11){
				if ((a.charAt(i) >= '0') & (a.charAt(i) <= '9')){
					s = 11;
				}else{
					s = -1;
				}
			}
			i += 1;	
		}
		System.out.println(s);
	}
}