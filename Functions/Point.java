public class Point{
	private int x; 
	private int y;

	public Point(int newx,int newy){
		x=newx;
		y=newy;
	}	
 
	public int getX(){
		return x; 
	}

	public int getY() {
		return y;
	}

	public void setX(int newX) {
		x=newX;
	}

	public void setY(int newY) {
		y=newY;
	}

	public double distanceNonStatic(Point p2){
		double a = x-p2.getX();
		double b = y-p2.getY();
		double c = a*a+b*b;
		return Math.sqrt(c);
	}

	public static distanceStatic(Point p1, Point p2) {
		double a = p1.getX() - p2.getX();
		double b = p1.getY() - p2.getY();
		double c = a*a + b*b;
		return Math.sqrt(c);
	}

	@Override
	public boolean equals(Object o) {
		Point p2 = (Point) o;

		if (getX()==p2.getx()&&(getY()==p2.getY()){
			return true;	
		}
		return false;
	}

}