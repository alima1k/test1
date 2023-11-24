public class RationalComplexNumber{
	private RationalFraction x, y;
	public RationalComplexNumber() {
		this(new RationalFraction(), new RationalFraction());
	}
	public RationalComplexNumber(RationalFraction x, RationalFraction y){
		this.x = x;
		this.y = y;
	}
	public RationalFraction getx(){
		return x;
	}
	public RationalFraction gety(){
		return y;
	}
	public RationalComplexNumber add(RationalComplexNumber rc2){
		RationalComplexNumber rc3 = new RationalComplexNumber();
		rc3.x = (this.x).add(rc2.getx());
		rc3.y = (this.y).add(rc2.gety());
		return rc3;

	}
	public RationalComplexNumber sub(RationalComplexNumber rc2){
		RationalComplexNumber rc3 = new RationalComplexNumber();
		rc3.x = (this.x).sub(rc2.getx());
		rc3.y = (this.y).sub(rc2.gety());
		return rc3;
	}
	public RationalComplexNumber mult(RationalComplexNumber rc2){
		RationalComplexNumber rc3 = new RationalComplexNumber();
		RationalFraction xx = (this.x).mult(rc2.getx());
		RationalFraction yy = (this.y).mult(rc2.gety());
		RationalFraction yx = (this.y).mult(rc2.getx());
		RationalFraction xy = (this.x).mult(rc2.gety());
		rc3.x = (xx).sub(yy);
		rc3.y = (yx).add(xy);
		return rc3;
	}
	public String toString() {
		String sign = " +";
		if (((this.y.getX() < 0) && (this.y.getY() >= 0)) | ((this.y.getY() < 0) && (this.y.getX() >= 0))){
			sign = "";
		}
		String str = x.toString() + sign + " "+ y.toString() + " i";
		return str;
	}
}