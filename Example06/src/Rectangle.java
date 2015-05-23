
public class Rectangle extends Polygon {

	public Rectangle(int w, int h) {
		super(w, h);
		height=h;
	}
	public int area() {
		return(width*height);
	}

}
