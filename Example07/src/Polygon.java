
abstract class Polygon {
	protected int width, height;
	public Polygon(int a) {
		width=a;
	}
	public void setValues(int a,int b) {
		width=a;
		height=b;
	}
	abstract public int area();
}
