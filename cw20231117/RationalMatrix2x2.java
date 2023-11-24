public class RationalMatrix2x2{
	private RationalFraction[][] a;
	public RationalMatrix2x2() {
		a = new RationalFraction[2][2];
	}
	public RationalMatrix2x2(RationalFraction n){
		a = new RationalFraction[2][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                this.a[i][j] = n;
            }
        }
	} 
	public RationalMatrix2x2(RationalFraction g, RationalFraction b, RationalFraction c, RationalFraction d){
		this.a = new RationalFraction[][]{{g, b}, {c, d}};
	}
	public RationalMatrix2x2 add(RationalMatrix2x2 rm2){
		RationalMatrix2x2 rm3 = new RationalMatrix2x2();
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < this.a[i].length; j ++ ){
				rm3.a[i][j] = (this.a[i][j]).add(rm2.a[i][j]);
			}
		}
		return rm3;
	}
	public RationalMatrix2x2 mult(RationalMatrix2x2 rm2){
		RationalMatrix2x2 rm3 = new RationalMatrix2x2();
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < rm2.a[i].length; j ++ ){
				RationalFraction sum = new RationalFraction();
				for (int k = 0; k < this.a[i].length; k ++ ){
					sum.add2(this.a[i][k].mult(rm2.a[k][j]));//тк сум = 0 оно обнуляется 
				}
				rm3.a[i][j] = sum;				
			}
		}
		return rm3;
	}
	public RationalFraction det(){
		RationalFraction a = this.a[0][0].mult(this.a[1][1]);
		RationalFraction b = this.a[1][0].mult(this.a[0][1]);
		RationalFraction det = a.sub(b);
		return det;
	}
	public RationalVector2D multVector(RationalVector2D v1){
		RationalVector2D rv3 = new RationalVector2D();
		rv3.setx(( this.a[0][0].mult(v1.getx())).add(a[0][1].mult(v1.gety())));
        rv3.sety((this.a[1][0].mult(v1.getx())).add(a[1][1].mult(v1.gety())));
        return rv3;
	}
	public void output(){
		for (int i = 0; i < a.length; i ++){
			System.out.println();
			for (int j = 0; j < a[0].length; j ++){
				System.out.print(a[i][j].toString() + " ");
			}
		}
		System.out.println();
	} 
}