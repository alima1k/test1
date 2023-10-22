


public class Task3b{
	public static int Chari(String a, int i, int s1){
		if ((a.charAt(i) >= '0') & (a.charAt(i) <= '9')){
			return s1;
		}else{
			return -1;
		}
	}
	public static int Dash(String a, int i, char a1, int s1){
		if (a.charAt(i) == a1){
			return s1;
		}else{
			return -1;
		}
	}
	public static void main(String[] args){
		String a = "+7-666-666-85+87";
		int s = 0;
		int i = 0;
		int k = 1;
		while ((i < a.length()) & (s != -1)){
			if (s == 0){
				s = Dash(a,i,'+', 1);
			}
			else if (s == 1){
				s = Dash(a, i, '7', 2);
			}else if (s == 2){
				s = Dash(a, i, '-', 3);
			}else if (s == 3){
				s = Chari(a, i, 4);
			}else if (s == 4){
				s = Chari(a, i, 5);
			}else if ( s == 5){
				s = Chari(a, i, 6);
			}else if (s == 6){
				s = Dash(a, i, '-', 7);
			}else if (s == 7){
				s = Chari(a, i, 8);
			}else if (s == 8){
				s = Chari(a, i, 9);
			}else if (s == 9){
				s = Chari(a, i, 10);
			}else if (s == 10){
				s = Dash(a, i, '-', 11);
			}else if (s == 11){
				s = Chari(a, i, 12);
			}else if (s == 12){
				s = Chari(a, i, 13);
			}else if (s == 13){
				s = Dash(a, i, '-', 14);
			}else if (s == 14){
				s = Chari(a, i, 15);
			}else if (s == 15){
				s = Chari(a, i, 16);
			}
		i += 1;
		}
		System.out.println(s);
	}
}