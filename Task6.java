public class Task6 {
	public static void main (String[] args){
		int x = -2;
		int y = 3;
		int r;
		if ((x*x+y*y)<=16){
			if (x>=0) {
				if ((y<=0)|(y>=2)) {
					r = 1;

				} else{
				r= 0;
				}
			}else if ( y >=2) {
			r = 1;
			} else {
			r= 0;
			}
		}else{
		r = 0;
		}
		if (r==1){
			System.out.println("x,y inside the area");
		} else {
		System.out.println(" x,y outside the area");
		}
		
	}
}