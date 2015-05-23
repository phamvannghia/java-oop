
public class Test {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		Rectangle rectb=new Rectangle();
		rect.setValues(3, 4);
		rect.setValues(5, 6);
		
		System.out.println("rect a:"+ rect.area());
		System.out.println("rect b:"+ rectb.area());
	}

}
