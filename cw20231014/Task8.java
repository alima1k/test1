public class Task8{
	public static void main(String[] args){
		String a = ")((()()))(";
		int open = 0;
		int close = 0;
		int i = 0;
		int flag = 1;
		while(( i < a.length()) & (flag == 1)){
			if (a.charAt(i) == '('){
			open += 1;
			}
			else if (a.charAt(i) == ')'){
				close += 1;
			}
			if (close - open > 0){
				flag = 0;
			}
			i += 1;
		}
		if ((open == close) & (flag ==1)){
			System.out.println("True");
		} else{
			System.out.println("False");
		}
	}
}