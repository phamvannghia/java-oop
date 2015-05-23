
public class Rectangle extends Polygon {

	public Rectangle(int w, int h) {
		super(w);
		height=h;
	}
	public int area() {
		return(width*height);
	}

}
