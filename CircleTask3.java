package GuviTaskJava3;

public class CircleTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CircleTask3();
		
		int CircleRadius= 4;

		new CircleTask3(CircleRadius, null);
		
		System.out.println("Circumference of circle is "+ Circumeference(CircleRadius));

	}
	
	public CircleTask3() {
		System.out.println("Calculation of Circle circumference");
		
	}
	
	public CircleTask3(int a, String b) {
		System.out.println("Radius of circle is "+a);
		System.out.println();
	}
	
	public static double Circumeference(int rad ) {
		
		double circleCircumference = 2 * Math.PI * rad;
		return circleCircumference;
		
		
	}

}
