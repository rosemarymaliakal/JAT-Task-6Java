package GuviTaskJava3;

public class PersonClassEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person MyObject = new Person();
		
		MyObject.setName("Arun");
		String MyName = MyObject.getName();
		System.out.println("Name is "+ MyName);
		
		MyObject.setAge(40);
		int MyAge = MyObject.getAge();
		System.out.println("Age is "+ MyAge);
	}

}
