public class RationalVector2D{
	private RationalFraction x;
	private RationalFraction y;
	private RationalFraction r1;
	public RationalVector2D() {
		this(new RationalFraction(), new RationalFraction());
	}
	public RationalVector2D(RationalFraction x, RationalFraction y){
		this.x = x;
		this.y = y;
	}
	public RationalVector2D add(RationalVector2D rv2) {
		RationalVector2D rv3 = new RationalVector2D();
		rv3.x = this.x.add(rv2.x);
		rv3.y = this.y.add(rv2.y);
		return rv3;
	}
	public String toString() {
		String str = "Координата x = " + this.x.toString() + ", координата y = " + this.y.toString();
		return str;
	}
	public double length() {
		RationalFraction xx = x.mult(x);
		RationalFraction yy = y.mult(y);
		double len = Math.sqrt(xx.add(yy).value());
		return len;
	}
	public RationalFraction scalarProduct(RationalVector2D rv2){
		RationalVector2D rv3 = new RationalVector2D();
		RationalFraction xx = this.x.mult(rv2.x);
		RationalFraction yy = this.y.mult(rv2.y);
		RationalFraction scalarProduct = xx.add(yy);
		return scalarProduct;
	}
	public boolean equals(RationalVector2D rv2) {
		if (this.x.equals(rv2.x) && this.y.equals(rv2.y)){
			return true;
		}else{
			return false;
		}
	} 
	public RationalFraction getx(){
		return x;
	}
	public RationalFraction gety(){
		return y;
	}
	public void setx(RationalFraction x){
		this.x = x;
	}
	public void sety(RationalFraction y){
		this.y = y;
	}

}