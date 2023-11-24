public class RationalFraction{
	private int x;
	private int y;
	public RationalFraction(){
		this(0,1);
	}
	public RationalFraction(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int nod(){
		int rem = Math.min(this.x, this.y);
		int num = Math.max(this.x, this.y);
		int den = Math.min(this.x, this.y);
		int nod = rem;
		while (rem > 0){
			nod = rem;
			rem = num - (num / den) * den;
			num = den;
			den = rem;
		}
		if (nod != 0){
			return nod;
		}else{
			return 1;
		}
	}
	public void reduce(){
		int nod = nod();
		this.setX( (this.x / nod) );
		this.setY( (this.y / nod) );
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public RationalFraction add(RationalFraction d2){
		RationalFraction d3 = new RationalFraction();
		d3.x = this.x * d2.getY() + d2.getX() * this.y;
		d3.y = this.y * d2.getY();
		d3.reduce();
		return d3;	
	}
	public void add2(RationalFraction d2){
		this.x = this.x * d2.getY() + d2.getX() * this.y;
		this.y = this.y * d2.getY();
		this.reduce();
	}
	public RationalFraction sub(RationalFraction d2){
		RationalFraction d3 = new RationalFraction();
		d3.x = this.x * d2.getY() - d2.getX() * this.y;
		d3.y = this.y * d2.getY();
		d3.reduce();
		return d3;	
	}
	public void sub2(RationalFraction d2){
		this.x = this.x * d2.getY() - d2.getX() * this.y;
		this.y = this.y * d2.getY();
		this.reduce();
	}
	public RationalFraction mult(RationalFraction d2){
		RationalFraction d3 = new RationalFraction();
		d3.x = this.x * d2.getX();
		d3.y = this.y * d2.getY();
		d3.reduce();
		return d3;	
	}
	public void mult2(RationalFraction d2){
		this.x = this.x * d2.getX();
		this.y = this.y * d2.getY();
		this.reduce();
	}
	public RationalFraction div(RationalFraction d2){
		RationalFraction d3 = new RationalFraction();
		d3.x = this.x * d2.getY();
		d3.y = this.y * d2.getX();
		d3.reduce();
		return d3;	
	} 
	public void div2(RationalFraction d2){
		this.x = this.x * d2.getY();
		this.y = this.y * d2.getX();
		this.reduce();
	} 
	public String toString(){
		String sign = "";
		if (((this.x < 0) && (this.y >= 0)) | ((this.y < 0) && (this.x >= 0))){
			sign = "- ";
		}
		String str = sign + Math.abs(this.x) + "/" + Math.abs(this.y);
		return str;
	}
	public double value(){
		double a = this.x / 1.0;
		double value = a / y;
		return value;
	}
	public boolean equals(RationalFraction d2){
		this.reduce();
		d2.reduce();
		if (( this.x == d2.getX()) && (this.y == d2.getY())){
			return true;
		}else{
			return false;
		}
	}
	public int numberPart(){
		int n = this.x / this.y;
		return n;
	}  
}