
public class Test {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		Triangle trgt=new Triangle();
		rect.setValues(4, 5);
		trgt.setValues(4, 5);
		System.out.println(rect.area());
		System.out.println(trgt.area());
		return;
	}

}
