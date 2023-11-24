public class RationalComplexMatrix2x2{
	private RationalComplexNumber [][] a;
	public RationalComplexMatrix2x2(){
		a = new RationalComplexNumber [2][2];
	}
	public RationalComplexMatrix2x2(RationalComplexNumber n){
		a = new RationalComplexNumber [2][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                this.a[i][j] = n;
            }
        }
	} 
	public RationalComplexMatrix2x2(RationalComplexNumber g, RationalComplexNumber b, RationalComplexNumber c, RationalComplexNumber d){
		this.a = new RationalComplexNumber [][]{{g, b}, {c, d}};
	}
	public RationalComplexMatrix2x2 add(RationalComplexMatrix2x2 rcm2){
		RationalComplexMatrix2x2 rcm3 = new RationalComplexMatrix2x2();
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < this.a[i].length; j ++ ){
				rcm3.a[i][j] = (this.a[i][j]).add(rcm2.a[i][j]);
			}
		}
		return rcm3;
	}
	public RationalComplexMatrix2x2 mult(RationalComplexMatrix2x2 rcm2){
		RationalComplexMatrix2x2 rcm3 = new RationalComplexMatrix2x2();
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < rcm2.a[i].length; j ++ ){
				RationalComplexNumber sum = new RationalComplexNumber();
				for (int k = 0; k < this.a[i].length; k ++ ){
					sum = sum.add(this.a[i][k].mult(rcm2.a[k][j]));
				}
				rcm3.a[i][j] = sum;				
			}
		}
		return rcm3;
	} 
	public RationalComplexNumber det(){
		RationalComplexNumber a = this.a[0][0].mult(this.a[1][1]);
		RationalComplexNumber b = this.a[1][0].mult(this.a[0][1]);
		RationalComplexNumber det = a.sub(b);
		return det;
	}
	public RationalComplexVector2D multVector(RationalComplexVector2D v1){
		RationalComplexVector2D cv3 = new RationalComplexVector2D();
		cv3.setx(( this.a[0][0].mult(v1.getx())).add(a[0][1].mult(v1.gety())));
        cv3.sety((this.a[1][0].mult(v1.getx())).add(a[1][1].mult(v1.gety())));
        return cv3;
	}
}